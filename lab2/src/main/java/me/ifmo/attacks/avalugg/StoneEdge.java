package me.ifmo.attacks.avalugg;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove{
    public StoneEdge(){
        super(Type.ROCK, 100, 80);
    }

    @Override
    public void applyOppDamage(Pokemon defender, double damage){
        super.applyOppDamage(defender, damage);
    }

    @Override
    public double calcCriticalHit(Pokemon attacker, Pokemon defender){
        if(Math.random() < (attacker.getStat(Stat.SPEED) / 256.0)){
            return 2.0;
        }
        else{
            return 1.0;
        }
    }

    @Override
    public String describe(){
        return "using Stone Edge...";
    }
}
