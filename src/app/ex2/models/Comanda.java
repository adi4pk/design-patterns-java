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
        observatori.add(observator);

//        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void dezaboneaza(Observator observator) {

        observatori.remove(observator);
    }

    public void schimbaStare(String stareNoua) {

        if(stareNoua == null || stareNoua.isBlank()){
            throw new IllegalArgumentException("State cannot be empty");
        }
        else if(stareNoua.equals(stare)){
            return;
        }

        stare = stareNoua;  //update the state of stare
        for (Observator observator: observatori){
            observator.actualizeaza(stareNoua);     //update the state of all Observers
        }

//        throw new UnsupportedOperationException("Not implemented yet");
    }
}
