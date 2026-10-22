package app.ex1;

import app.ex1.models.Comanda;
import app.ex1.models.LivrareExpress;
import app.ex1.models.LivrareGratuita;
import app.ex1.models.LivrareStandard;

public class Testare1 {

    public static void ruleaza() {

        Comanda comanda1 = new Comanda("Ana", 10, 100, new LivrareStandard());

        System.out.println(comanda1.getStrategie().getNume() + ": " + comanda1.costTransport());
        comanda1.schimbaStrategie(new LivrareExpress());
        System.out.println(comanda1.getStrategie().getNume() + ": " + comanda1.costTransport());
        comanda1.schimbaStrategie(new LivrareGratuita());
        System.out.println(comanda1.getStrategie().getNume() + ": " + comanda1.costTransport());

        Comanda comanda2 = new Comanda("Alex", 0, 100, new LivrareStandard());
    }
}
