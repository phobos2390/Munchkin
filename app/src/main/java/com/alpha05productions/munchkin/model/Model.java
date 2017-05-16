package com.alpha05productions.munchkin.model;

import java.util.List;

/**
 * Created by jlarsen on 5/14/2017.
 */

public class Model
{
    public Model(List<Monster> doorList, List<Weapon> treasureList, List<Player> playerList)
    {
        doors = doorList;
        treasures = treasureList;
        players = playerList;
    }

    public void progressGameState()
    {
        currentState = currentState.onProgressState(this);
    }

    public void killPlayer(Player p)
    {
        if(playerIterator >= players.indexOf(p))
        {
            playerIterator--;
            if(playerIterator < 0)
            {
                playerIterator += players.size() - 1;
            }
        }
        players.remove(p);
    }

    public Monster openDoor()
    {
        return doors.remove(0);
    }

    public Weapon takeTreasure()
    {
        return treasures.remove(0);
    }

    public Player getNextPlayer()
    {
        playerIterator = (playerIterator + 1) % players.size();
        return players.get(playerIterator);
    }

    private int playerIterator;
    private IGameState currentState;
    private List<Monster> doors;
    private List<Weapon> treasures;
    private List<Player> players;
}
