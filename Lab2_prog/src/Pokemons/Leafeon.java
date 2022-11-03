package Pokemons;
import Attacks.Leafeon.*;
import ru.ifmo.se.pokemon.*;

public class Leafeon extends Eevee {
    public Leafeon(String name, int lvl){
        super(name, lvl);
        this.setType(Type.GRASS);
        this.setStats(65, 111, 130, 60, 65, 95);
        this.addMove(new LeafBlade(90, 100));
    }
}
