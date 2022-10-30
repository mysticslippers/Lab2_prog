package Attacks.Diancie;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
    public Confide(double pwr, double acc){
        super(Type.NORMAL, pwr, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        defender.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "Использовал Confide!";
    }
}
