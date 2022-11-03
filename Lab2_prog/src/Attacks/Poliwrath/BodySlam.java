package Attacks.Poliwrath;
import ru.ifmo.se.pokemon.*;

public class BodySlam extends PhysicalMove{
    public BodySlam(double pwr, double acc){
        super(Type.NORMAL, pwr, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        Effect BodySlam = new Effect().chance(0.3);
        if(BodySlam.success()){
            Effect.paralyze(defender);
        }
    }

    @Override
    protected String describe() {
        return ("использует Body Slam!");
    }
}
