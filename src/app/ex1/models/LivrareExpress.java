package app.ex1.models;

public class LivrareExpress implements LivrareStrategie {

    @Override
    public String getNume() {
        return "Express";
    }

    @Override
    public double calculeazaCost(double greutateKg, double distantaKm) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
