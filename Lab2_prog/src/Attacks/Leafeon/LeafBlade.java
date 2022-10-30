package Attacks.Leafeon;
import ru.ifmo.se.pokemon.*;

public class LeafBlade extends PhysicalMove{
    public LeafBlade(double pwr, double acc){
        super(Type.GRASS, pwr, acc);
    }

    @Override
    protected double calcCriticalHit(Pokemon attacker, Pokemon defender) {
        if((attacker.getStat(Stat.SPEED) / 512.0D * 3) > Math.random()){
            System.out.println("Критический удар!");
            return 2;
        }
        else{
            System.out.println("Критический удар не выпал...");
            return 1;
        }
    }

    @Override
    protected String describe() {
        return "использовал Leaf Blade!";
    }
}
