package me.ifmo.attacks.common;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    public void applyOppDamage(Pokemon defender, double damage){
        Status pokemonStatus = defender.getCondition();
        if(pokemonStatus == Status.BURN || pokemonStatus == Status.PARALYZE || pokemonStatus == Status.POISON){
            super.applyOppDamage(defender, damage * 2);
        }
        else{
            super.applyOppDamage(defender, damage);
        }
    }

    @Override
    public String describe(){
        return "using Facade...";
    }
}
