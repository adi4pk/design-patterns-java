package app.ex1.models;

public class LivrareStandard implements LivrareStrategie {

    @Override
    public String getNume() {
        return "Standard";
    }

    @Override
    public double calculeazaCost(double greutateKg, double distantaKm) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
