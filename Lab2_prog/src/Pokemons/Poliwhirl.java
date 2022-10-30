package Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.Poliwrath.*;

public class Poliwhirl extends Poliwag{
    public Poliwhirl(String name, int lvl){
        super(name, lvl);
        super.setType(Type.WATER);
        super.setStats(65, 65, 65, 50, 50, 90);
        super.addMove(new BodySlam(85, 100));
    }
}
