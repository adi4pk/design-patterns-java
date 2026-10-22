package app.ex2.models;

public class NotificatorEmail implements Observator {

    @Override
    public void actualizeaza(String stareNoua) {
        System.out.println("[EMAIL] Comanda a trecut in starea: " + stareNoua);
//        throw new UnsupportedOperationException("Not implemented yet");
    }
}
