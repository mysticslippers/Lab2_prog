package Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.Diancie.*;
import Attacks.Common.DoubleTeam;


public class Diancie extends Pokemon{
    public Diancie(String name, int lvl) {
        super(name, lvl);
        super.setType(Type.ROCK, Type.FAIRY);
        super.setStats(50, 100, 150, 100, 150, 50);
        super.setMove(new Confide(0, 100), new RockPolish(0, 100), new Tackle(40, 100), new DoubleTeam(0, 100));
    }
}
