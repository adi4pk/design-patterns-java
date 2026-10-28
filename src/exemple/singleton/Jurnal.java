package exemple.singleton;

import java.util.ArrayList;
import java.util.List;

public class Jurnal {
    private static final Jurnal INSTANTA = new Jurnal();

    private final List<String> linii = new ArrayList<>();

    private Jurnal() {
    }

    public static Jurnal getInstance() {
        return INSTANTA;
    }

    public void scrie(String mesaj) {
        linii.add(mesaj);
        System.out.println("[LOG " + linii.size() + "] " + mesaj);
    }

    public int numarLinii() {
        return linii.size();
    }
}
