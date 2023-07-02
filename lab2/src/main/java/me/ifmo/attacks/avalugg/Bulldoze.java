package me.ifmo.attacks.avalugg;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove{
    public Bulldoze(){
        super(Type.GROUND, 60, 100);
    }

    @Override
    public void applyOppDamage(Pokemon defender, double damage){
        super.applyOppDamage(defender, damage);
        defender.setMod(Stat.SPEED, -6);
    }

    @Override
    public String describe(){
        return "using Bulldoze...";
    }
}
