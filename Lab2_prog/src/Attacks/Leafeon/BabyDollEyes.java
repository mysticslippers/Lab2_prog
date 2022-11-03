package Attacks.Leafeon;
import ru.ifmo.se.pokemon.*;

public class BabyDollEyes extends StatusMove{
    public BabyDollEyes(double pwr, double acc){
        super(Type.FAIRY, pwr, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon defender){
        defender.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "использует Baby-Doll Eyes!";
    }
}
