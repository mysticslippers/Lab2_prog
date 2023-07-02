package me.ifmo.attacks.bellossom;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove{
    public Growth(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    public void applySelfEffects(Pokemon owner){
        owner.setMod(Stat.ATTACK, 6);
        owner.setMod(Stat.SPECIAL_ATTACK, 6);
        super.applySelfEffects(owner);
    }

    @Override
    public String describe(){
        return "using Growth...";
    }
}
