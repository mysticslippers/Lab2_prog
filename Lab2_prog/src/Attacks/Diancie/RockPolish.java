package Attacks.Diancie;
import ru.ifmo.se.pokemon.*;

public class RockPolish extends StatusMove{
    public RockPolish(double pwr, double acc){
        super(Type.ROCK, pwr, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon attacker) {
        attacker.setMod(Stat.SPEED, 2);
    }

    @Override
    protected String describe() {
        return "использовал Rock Polish!";
    }
}
