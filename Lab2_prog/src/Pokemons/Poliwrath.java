package Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.Poliwrath.*;

public class Poliwrath extends Poliwhirl{
    public Poliwrath(String name, int lvl){
        super(name, lvl);
        this.setType(Type.WATER, Type.FIGHTING);
        this.setStats(90, 95, 95, 70, 90, 70);
        this.addMove(new RockSlide(75, 90));
    }
}
