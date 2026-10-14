package app.ex5.models;

public class FabricaStudent implements FabricaUtilizator {

    @Override
    public String getTip() {
        return "STUDENT";
    }

    @Override
    public Utilizator creeaza(String[] campuri) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
