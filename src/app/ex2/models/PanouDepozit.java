package app.ex2.models;

public class PanouDepozit implements Observator {

    @Override
    public void actualizeaza(String stareNoua) {

        System.out.println("[DEPOZIT] Pregatesc pentru: " + stareNoua);
//        throw new UnsupportedOperationException("Not implemented yet");
    }
}
