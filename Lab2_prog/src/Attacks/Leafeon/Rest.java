package Attacks.Leafeon;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(double pwr, double acc){
        super(Type.PSYCHIC, pwr, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon attacker) {
        Effect Sleep = new Effect().chance(1).turns(2).condition(Status.SLEEP);
        Effect RecoveredHP = new Effect().chance(1).turns(2).stat(Stat.HP, -(-1 - (int) attacker.getHP()));
        attacker.addEffect(RecoveredHP);
        attacker.setCondition(Sleep);
    }

    @Override
    protected String describe() {
        return "использовал Rest!";
    }
}
