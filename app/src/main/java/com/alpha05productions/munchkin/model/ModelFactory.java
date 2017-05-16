package com.alpha05productions.munchkin.model;

/**
 * Created by jlarsen on 5/14/2017.
 */

public class ModelFactory
{
    public Weapon createWeapon(int power, int cost)
    {
        return new Weapon(power, cost);
    }

    public Player createPlayer()
    {
        return new Player();
    }

    public Monster createMonster(int level, int treasure, IDefeatEvent defeatEvent)
    {
        return new Monster(level, treasure, defeatEvent);
    }

    public IDefeatEvent createOnDefeatEvent(String eventName, Model m)
    {
        IDefeatEvent returnEvent = null;
        if(eventName.equalsIgnoreCase("death"))
        {
            returnEvent = new DeathDefeatEvent(m);
        }
        if(eventName.contains("levels"))
        {
            int indexOfLevels = eventName.indexOf("levels") + "levels".length();
            String numberOfLevels = eventName.substring(indexOfLevels);
            returnEvent = new LevelLossDefeatEvent(Integer.parseInt(numberOfLevels));
        }
        return returnEvent;
    }
}
