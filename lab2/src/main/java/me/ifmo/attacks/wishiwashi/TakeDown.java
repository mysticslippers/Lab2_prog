package me.ifmo.attacks.wishiwashi;

import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove{
    public TakeDown(){
        super(Type.NORMAL, 90, 85);
    }

    @Override
    public void applyOppDamage(Pokemon defender, double damage){
        super.applyOppDamage(defender, damage);
    }

    @Override
    public void applySelfEffects(Pokemon owner){
        double ownerHP = owner.getHP();
        Effect lostHP = new Effect().turns(0).stat(Stat.HP, (int) (ownerHP - ownerHP / 4));
        owner.addEffect(lostHP);
    }

    @Override
    public String describe(){
        return "using Take Down...";
    }
}
