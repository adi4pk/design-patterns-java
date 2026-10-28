package app.ex3.models;

import java.util.ArrayList;
import java.util.List;

public class IncarcatorUtilizatori {

    public List<Utilizator> incarca(List<String> linii) {
        List<Utilizator> utilizatori = new ArrayList<>();
        for (String linie : linii) {
            String[] campuri = linie.split(",");
            switch (campuri[0]) {
                case "STUDENT":
                    utilizatori.add(new Student(campuri[1], campuri[2], campuri[3]));
                    break;
                case "PROFESOR":
                    utilizatori.add(new Profesor(campuri[1], campuri[2], campuri[3]));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown user type: " + campuri[0]);
            }
        }
        return utilizatori;
    }
}
