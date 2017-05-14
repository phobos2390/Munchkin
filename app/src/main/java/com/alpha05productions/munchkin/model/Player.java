package com.alpha05productions.munchkin.model;

/**
 * Created by jlarsen on 5/14/2017.
 */

public class Player
{
    public int getPower()
    {
        return level + bonusPower + temporaryBonusPower;
    }

    public int getLevel()
    {
        return level;
    }

    public void addLevel(int amount)
    {
        level += amount;
    }

    public void addTemporaryPower(int tempPower)
    {
        temporaryBonusPower += tempPower;
    }

    public void addBonusPower(int power)
    {
        bonusPower = power;
    }

    private int level;
    private int bonusPower;
    private int temporaryBonusPower;
}
