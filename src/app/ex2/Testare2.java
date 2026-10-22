package app.ex2;

import app.ex2.models.Comanda;
import app.ex2.models.JurnalLivrare;
import app.ex2.models.NotificatorEmail;
import app.ex2.models.PanouDepozit;

public class Testare2 {

    public static void ruleaza() {

        //CTRL + Alt + L - format code

        Comanda comanda1 = new Comanda("Amazon");
        System.out.println(comanda1.getStare());
        comanda1.schimbaStare("livrat");
        System.out.println(comanda1.getStare());

        Comanda comanda = new Comanda("Ana");
        PanouDepozit depozit = new PanouDepozit();

        comanda.aboneaza(new NotificatorEmail());
        comanda.aboneaza(new JurnalLivrare());
        comanda.aboneaza(depozit);

        comanda.schimbaStare("Expediata");

        comanda.dezaboneaza(depozit);
        comanda.schimbaStare("Livrata");
        System.out.println("Stare finala: " + comanda.getStare());
        try {
            comanda.schimbaStare(" ");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        comanda.aboneaza(new NotificatorEmail());
        comanda.schimbaStare("RETURNAT");

    }


}
