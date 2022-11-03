import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Battleground{
    public static void main(String[] args){
        Battle b = new Battle();
        Diancie p1 = new Diancie("Тесть", 3);
        Eevee p2 = new Eevee("Тёща", 3);
        Poliwrath p3 = new Poliwrath("Зять", 3);
        Poliwag p4 = new Poliwag("Кум", 3);
        Poliwhirl p5 = new Poliwhirl("Свекровь", 3);
        Leafeon p6 = new Leafeon("Свёкр", 3);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
