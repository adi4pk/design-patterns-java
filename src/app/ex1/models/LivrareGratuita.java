package app.ex1.models;

public class LivrareGratuita implements LivrareStrategie {

    @Override
    public String getNume() {
        return "Gratuita";
    }

    @Override
    public double calculeazaCost(double greutateKg, double distantaKm) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
