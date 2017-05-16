package com.alpha05productions.munchkin.model;

/**
 * Created by jlarsen on 5/14/2017.
 */

public class CombatState implements IGameState
{
    public CombatState(Monster combattingMonster, Player combattingPlayer)
    {
        monster = combattingMonster;
        player = combattingPlayer;
    }

    @Override
    public IGameState onProgressState(Model e)
    {
        if(monster.getPower() < player.getPower())
        {
            int treasureAmount = monster.getTreasure();
            for(int i = 0; i < treasureAmount; i++)
            {
                Weapon w = e.takeTreasure();
                player.addBonusPower(w.getPower());
            }
        }
        else
        {
            monster.getDefeatEvent().OnDefeat(player,monster);
        }
        return new NextTurnState();
    }

    private Monster monster;
    private Player player;
}
