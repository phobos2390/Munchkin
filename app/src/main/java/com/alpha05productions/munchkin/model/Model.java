package com.alpha05productions.munchkin.model;

import java.util.List;

/**
 * Created by jlarsen on 5/14/2017.
 */

public class Model
{
    public void progressGameState()
    {
        currentState = currentState.progressState(this);
    }

    public void killPlayer(Player p)
    {
        players.remove(p);
    }

    public Monster openDoor()
    {
        return doors.remove(0);
    }

    private IGameState currentState;
    private List<Monster> doors;
    private List<Player> players;
}
