package Attacks.Diancie;
import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove{
    public Tackle(double pwr, double acc){
        super(Type.NORMAL, pwr, acc);
    }

    @Override
    protected String describe() {
        return "использовал Tackle!";
    }
}
