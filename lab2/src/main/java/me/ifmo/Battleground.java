package me.ifmo;

import me.ifmo.pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Battleground {
    public static void main(String[] args){
        Battle battle = new Battle();

        Oddish oddish = new Oddish("Невестка", 10);
        Gloom gloom = new Gloom("Свёкор", 10);
        Bellossom bellossom = new Bellossom("Свекровь", 10);
        Wishiwashi wishiwashi = new Wishiwashi("Зять", 10);
        Bergmite bergmite = new Bergmite("Тёща", 10);
        Avalugg avalugg = new Avalugg("Тесть", 10);

        battle.addAlly(wishiwashi);
        battle.addAlly(bergmite);
        battle.addAlly(bellossom);

        battle.addFoe(oddish);
        battle.addFoe(gloom);
        battle.addFoe(avalugg);

        battle.go();
    }
}