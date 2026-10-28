package app.ex6;

import app.ex6.models.Comanda;
import app.ex6.models.GeneratorNumere;
import app.ex6.models.Retur;

public class Testare6 {

    public static void ruleaza() {
        GeneratorNumere generator = new GeneratorNumere();
        Comanda ana = new Comanda("Ana", generator);
        Comanda ion = new Comanda("Ion", generator);
        Retur retur = new Retur(ana, generator);
        System.out.println(ana.descriere());
        System.out.println(ion.descriere());
        System.out.println(retur.descriere());
        Comanda maria = new Comanda("Maria", generator);
        System.out.println(maria.descriere());
    }
}
