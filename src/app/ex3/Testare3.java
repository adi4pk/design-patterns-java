package app.ex3;

import app.ex3.models.IncarcatorUtilizatori;
import app.ex3.models.Utilizator;

import java.util.List;

public class Testare3 {

    public static void ruleaza() {
        IncarcatorUtilizatori incarcator = new IncarcatorUtilizatori();
        List<String> linii = List.of(
                "STUDENT,Ana,Popescu,anul 2",
                "PROFESOR,Ion,Ionescu,Matematica",
                "STUDENT,Radu,Marin,anul 1");
        for (Utilizator utilizator : incarcator.incarca(linii)) {
            System.out.println(utilizator.descriere());
        }
        try {
            incarcator.incarca(List.of("SECRETAR,Dan,Pop,Registratura"));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
