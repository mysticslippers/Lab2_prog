package me.ifmo.attacks.bellossom;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove{
    public SwordsDance(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    public void applySelfEffects(Pokemon owner){
        owner.setMod(Stat.ATTACK, 6);
        super.applySelfEffects(owner);
    }

    @Override
    public String describe(){
        return "using Swords Dance...";
    }
}
