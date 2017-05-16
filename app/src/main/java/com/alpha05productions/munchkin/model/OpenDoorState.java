package com.alpha05productions.munchkin.model;

/**
 * Created by jlarsen on 5/14/2017.
 */

public class OpenDoorState implements IGameState
{
    public OpenDoorState(Player currentPlayer)
    {
        player = currentPlayer;
    }

    @Override
    public IGameState onProgressState(Model e)
    {
        Monster monsterBehindDoor = e.openDoor();
        return new CombatState(monsterBehindDoor,player);
    }

    private Player player;
}
