package com.alpha05productions.munchkin.model;

/**
 * Created by jlarsen on 5/14/2017.
 */

public class DeathDefeatEvent implements IDefeatEvent
{
    public DeathDefeatEvent(Model m)
    {
        model = m;
    }

    @Override
    public void OnDefeat(Player p, Monster m)
    {
        model.killPlayer(p);
    }

    private Model model;
}
