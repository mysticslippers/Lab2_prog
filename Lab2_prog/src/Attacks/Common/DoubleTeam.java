package Attacks.Common;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
    public DoubleTeam(double pwr, double acc){
        super(Type.NORMAL, pwr, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon attacker) {
        attacker.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe() {
        return "использовал Double Team!";
    }
}
