package me.ifmo.pokemons;

import me.ifmo.attacks.bellossom.Growth;
import ru.ifmo.se.pokemon.*;

public class Gloom extends Oddish{
    public Gloom(String name, int level){
        super(name, level);
        setType(Type.GRASS, Type.POISON);
        setStats(60, 65, 70, 85, 75, 40);
        addMove(new Growth());
    }
}
