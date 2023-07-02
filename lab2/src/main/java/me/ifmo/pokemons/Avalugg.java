package me.ifmo.pokemons;

import me.ifmo.attacks.avalugg.Bulldoze;
import ru.ifmo.se.pokemon.*;

public class Avalugg extends Bergmite{
    public Avalugg(String name, int level){
        super(name, level);
        setType(Type.ICE);
        setStats(95, 117, 184, 44, 46, 28);
        addMove(new Bulldoze());
    }
}
