package me.ifmo.attacks.common;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    public void applySelfEffects(Pokemon owner){
        Effect sleep = new Effect().turns(2).condition(Status.SLEEP);
        Effect recoveryHP = new Effect().turns(0).stat(Stat.HP, -999999999);
        owner.addEffect(recoveryHP);
        owner.setCondition(sleep);
    }

    @Override
    public String describe(){
        return "using Rest...";
    }
}
