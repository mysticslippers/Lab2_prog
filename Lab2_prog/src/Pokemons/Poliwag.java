package Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.Poliwrath.*;
import Attacks.Common.DoubleTeam;


public class Poliwag extends Pokemon{
    public Poliwag(String name, int lvl){
        super(name, lvl);
        this.setType(Type.WATER);
        this.setStats(40, 50, 40, 40, 40, 90);
        this.setMove(new DoubleTeam(0, 100), new Swagger(0, 85));
    }
}
