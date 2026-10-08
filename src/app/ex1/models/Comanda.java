package app.ex1.models;

public class Comanda {
    private final String client;
    private final double greutateKg;
    private final double distantaKm;
    private LivrareStrategie strategie;

    public Comanda(String client, double greutateKg, double distantaKm, LivrareStrategie strategie) {
        if (greutateKg <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
        if (distantaKm < 0) {
            throw new IllegalArgumentException("Distance cannot be negative");
        }
        this.client = client;
        this.greutateKg = greutateKg;
        this.distantaKm = distantaKm;
        this.strategie = strategie;
    }

    public String getClient() {
        return client;
    }

    public double getGreutateKg() {
        return greutateKg;
    }

    public double getDistantaKm() {
        return distantaKm;
    }

    public LivrareStrategie getStrategie() {
        return strategie;
    }

    public void schimbaStrategie(LivrareStrategie noua) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public double costTransport() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
