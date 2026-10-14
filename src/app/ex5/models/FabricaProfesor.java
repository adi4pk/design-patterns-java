package app.ex5.models;

public class FabricaProfesor implements FabricaUtilizator {

    @Override
    public String getTip() {
        return "PROFESOR";
    }

    @Override
    public Utilizator creeaza(String[] campuri) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
