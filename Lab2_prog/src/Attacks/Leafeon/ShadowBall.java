package Attacks.Leafeon;
import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove{
    public ShadowBall(double pwr, double acc){
        super(Type.GHOST, pwr, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        Effect ShadowBall = new Effect().chance(0.2);
        if(ShadowBall.success()){
            defender.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "использовал Shadow Ball!";
    }
}
