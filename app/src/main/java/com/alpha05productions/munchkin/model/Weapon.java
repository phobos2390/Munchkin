package com.alpha05productions.munchkin.model;

/**
 * Created by jlarsen on 5/14/2017.
 */

public class Weapon
{
    public Weapon(int weaponPower, int weaponCost)
    {
        power = weaponPower;
        cost = weaponCost;
    }

    public int getPower()
    {
        return power;
    }

    private int getCost()
    {
        return cost;
    }

    private int power;
    private int cost;
}
