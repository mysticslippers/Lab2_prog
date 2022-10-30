package Pokemons;
import Attacks.Leafeon.*;
import ru.ifmo.se.pokemon.*;

public class Leafeon extends Eevee {
    public Leafeon(String name, int lvl){
        super(name, lvl);
        super.setType(Type.GRASS);
        super.setStats(65, 111, 130, 60, 65, 95);
        super.addMove(new LeafBlade(90, 100));
    }
}
