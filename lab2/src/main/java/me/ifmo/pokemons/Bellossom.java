package me.ifmo.pokemons;

import me.ifmo.attacks.common.Facade;
import ru.ifmo.se.pokemon.*;

public class Bellossom extends Gloom{
    public Bellossom(String name, int level){
        super(name, level);
        setType(Type.GRASS);
        setStats(75, 80, 95, 90, 100, 50);
        addMove(new Facade());
    }
}
