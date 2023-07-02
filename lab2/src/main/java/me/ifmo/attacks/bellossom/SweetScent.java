package me.ifmo.attacks.bellossom;

import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove{
    public SweetScent(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    public void applyOppEffects(Pokemon defender){
        defender.setMod(Stat.EVASION, -6);
        super.applyOppEffects(defender);
    }

    @Override
    public String describe(){
        return "using Sweet Scent...";
    }
}
