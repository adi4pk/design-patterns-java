package app.ex2.models;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private final String client;
    private String stare;
    private final List<Observator> observatori = new ArrayList<>();

    public Comanda(String client) {
        if (client == null || client.isBlank()) {
            throw new IllegalArgumentException("Client cannot be empty");
        }
        this.client = client;
        this.stare = "Plasata";
    }

    public String getClient() {
        return client;
    }

    public String getStare() {
        return stare;
    }

    public void aboneaza(Observator observator) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void dezaboneaza(Observator observator) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void schimbaStare(String stareNoua) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
