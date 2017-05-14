package com.alpha05productions.munchkin.model;

/**
 * Created by jlarsen on 5/14/2017.
 */

public class Monster
{
    public int getPower()
    {
        return level + bonusPower;
    }

    public int getTreasure()
    {
        return treasure + bonusTreasure;
    }

    private int level;
    private int treasure;
    private int bonusPower;
    private int bonusTreasure;
    private IDefeatEvent defeatEvent;
}
