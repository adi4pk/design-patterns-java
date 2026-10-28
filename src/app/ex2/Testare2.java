package app.ex2;

import app.ex2.models.Comanda;

public class Testare2 {

    public static void ruleaza() {
        Comanda comanda = new Comanda("Ana");
        comanda.schimbaStare("Expediata");
        comanda.schimbaStare("Expediata");
        comanda.schimbaStare("Livrata");
        System.out.println("Stare finala: " + comanda.getStare());
        try {
            comanda.schimbaStare(" ");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
