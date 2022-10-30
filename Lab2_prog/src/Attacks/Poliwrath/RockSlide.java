package Attacks.Poliwrath;
import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove{
    public RockSlide(double pwr, double acc) {
        super(Type.ROCK, pwr, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        Effect Flinch = new Effect().chance(0.3);
        if(Flinch.success()){
            Effect.flinch(defender);
        }
    }

    @Override
    protected String describe() {
        return "использовал Rock Slide!";
    }
}
