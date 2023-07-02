package me.ifmo.attacks.avalugg;

import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove{
    public Tackle(){
        super(Type.NORMAL, 40, 100);
    }

    @Override
    public void applyOppDamage(Pokemon defender, double damage){
        super.applyOppDamage(defender, damage);
    }

    @Override
    public String describe(){
        return "using Tackle...";
    }
}
