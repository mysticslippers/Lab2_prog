package Attacks.Poliwrath;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{
    public Swagger(double pwr, double acc){
        super(Type.NORMAL, pwr, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon defender){
        Effect.confuse(defender);
    }

    @Override
    protected void applySelfEffects(Pokemon attacker) {
        attacker.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "использует Swagger!";
    }
}
