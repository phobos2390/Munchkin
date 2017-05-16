package com.alpha05productions.munchkin.model;

/**
 * Created by jlarsen on 5/14/2017.
 */

public class LevelLossDefeatEvent implements IDefeatEvent
{
    public LevelLossDefeatEvent(int numberOfLevels)
    {
        levelsLost = numberOfLevels;
    }

    @Override
    public void OnDefeat(Player p, Monster m)
    {
        p.addLevel(-levelsLost);
    }

    private int levelsLost;
}
