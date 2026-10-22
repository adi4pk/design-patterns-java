package app.ex2.models;

public class JurnalLivrare implements Observator {

    @Override
    public void actualizeaza(String stareNoua) {
        System.out.println("[LOG] Stare inregistrata: " + stareNoua);
//        throw new UnsupportedOperationException("Not implemented yet");

    }
}
