package com.alpha05productions.munchkin.model;

/**
 * Created by jlarsen on 5/14/2017.
 */

public class NextTurnState implements IGameState
{
    @Override
    public IGameState onProgressState(Model e)
    {
        return new OpenDoorState(e.getNextPlayer());
    }
}
