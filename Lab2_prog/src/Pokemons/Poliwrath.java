package Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.Poliwrath.*;

public class Poliwrath extends Poliwhirl{
    public Poliwrath(String name, int lvl){
        super(name, lvl);
        super.setType(Type.WATER, Type.FIGHTING);
        super.setStats(90, 95, 95, 70, 90, 70);
        super.addMove(new RockSlide(75, 90));
    }
}
