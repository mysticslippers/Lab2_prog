package me.ifmo.attacks.wishiwashi;

import ru.ifmo.se.pokemon.*;

public class WaterGun extends SpecialMove{
    public WaterGun(){
        super(Type.WATER, 40, 100);
    }

    @Override
    public void applyOppDamage(Pokemon defender, double damage){
        super.applyOppDamage(defender, damage);
    }

    @Override
    public String describe(){
        return "using Water Gun...";
    }
}
