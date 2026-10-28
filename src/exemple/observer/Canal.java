package exemple.observer;

import java.util.ArrayList;
import java.util.List;

public class Canal {
    private final List<Abonat> abonati = new ArrayList<>();

    public void aboneaza(Abonat abonat) {
        abonati.add(abonat);
    }

    public void dezaboneaza(Abonat abonat) {
        abonati.remove(abonat);
    }

    public void publica(String titlu) {
        for (Abonat abonat : abonati) {
            abonat.notifica(titlu);
        }
    }
}
