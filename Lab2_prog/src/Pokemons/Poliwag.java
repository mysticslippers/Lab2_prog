package Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.Poliwrath.*;
import Attacks.Common.DoubleTeam;


public class Poliwag extends Pokemon{
    public Poliwag(String name, int lvl){
        super(name, lvl);
        super.setType(Type.WATER);
        super.setStats(40, 50, 40, 40, 40, 90);
        super.setMove(new DoubleTeam(0, 100), new Swagger(0, 85));
    }
}
