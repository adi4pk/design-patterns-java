package exemple.factory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FabricaForma> fabrici = List.of(new FabricaCerc(), new FabricaPatrat());
        for (String linie : List.of("CERC,2", "PATRAT,3", "TRIUNGHI,4")) {
            String[] campuri = linie.split(",");
            try {
                Forma forma = fabricaPentru(fabrici, campuri[0])
                        .creeaza(Double.parseDouble(campuri[1]));
                System.out.println(forma.descriere());
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static FabricaForma fabricaPentru(List<FabricaForma> fabrici, String tip) {
        for (FabricaForma fabrica : fabrici) {
            if (fabrica.getTip().equals(tip)) {
                return fabrica;
            }
        }
        throw new IllegalArgumentException("Unknown shape: " + tip);
    }
}
