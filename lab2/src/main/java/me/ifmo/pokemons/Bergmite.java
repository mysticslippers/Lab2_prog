package me.ifmo.pokemons;

import me.ifmo.attacks.avalugg.*;
import me.ifmo.attacks.common.Rest;
import ru.ifmo.se.pokemon.*;

public class Bergmite extends Pokemon{
    public Bergmite(String name, int level){
        super(name, level);
        setType(Type.ICE);
        setStats(55, 69, 85, 32, 35, 28);
        setMove(new Tackle(), new StoneEdge(), new Rest());
    }
}
