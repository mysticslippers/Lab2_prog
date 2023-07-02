package me.ifmo.pokemons;

import me.ifmo.attacks.common.*;
import me.ifmo.attacks.wishiwashi.*;
import ru.ifmo.se.pokemon.*;

public class Wishiwashi extends Pokemon{
    public Wishiwashi(String name, int level){
        super(name, level);
        setType(Type.WATER);
        setStats(45, 20, 20, 25, 25, 40);
        setMove(new WaterGun(), new Facade(), new TakeDown(), new Rest());
    }
}
