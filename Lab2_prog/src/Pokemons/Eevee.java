package Pokemons;
import Attacks.Leafeon.BabyDollEyes;
import Attacks.Leafeon.Rest;
import Attacks.Leafeon.ShadowBall;
import ru.ifmo.se.pokemon.*;

public class Eevee extends Pokemon{
    public Eevee(String name, int lvl){
        super(name, lvl);
        super.setType(Type.NORMAL);
        super.setStats(55, 55, 50, 45, 65, 55);
        super.setMove(new BabyDollEyes(0, 100), new Rest(0, 100), new ShadowBall(80, 100));
    }
}
