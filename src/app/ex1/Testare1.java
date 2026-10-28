package app.ex1;

import app.ex1.models.Comanda;
import app.ex1.models.TipLivrare;

public class Testare1 {

    public static void ruleaza() {
        afiseaza(new Comanda("Ana", 10, 100, TipLivrare.STANDARD));
        afiseaza(new Comanda("Ana", 10, 100, TipLivrare.EXPRESS));
        afiseaza(new Comanda("Ana", 10, 100, TipLivrare.GRATUITA));
        try {
            new Comanda("Ion", 0, 50, TipLivrare.STANDARD);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void afiseaza(Comanda comanda) {
        System.out.println(comanda.numeLivrare() + ": " + comanda.cost());
    }
}
