package app.ex1.models;

public class Comanda {
    private final String client;
    private final double greutateKg;
    private final double distantaKm;
    private final TipLivrare tip;

    public Comanda(String client, double greutateKg, double distantaKm, TipLivrare tip) {
        if (greutateKg <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
        if (distantaKm < 0) {
            throw new IllegalArgumentException("Distance cannot be negative");
        }
        this.client = client;
        this.greutateKg = greutateKg;
        this.distantaKm = distantaKm;
        this.tip = tip;
    }

    public String getClient() {
        return client;
    }

    public String numeLivrare() {
        switch (tip) {
            case STANDARD:
                return "Standard";
            case EXPRESS:
                return "Express";
            case GRATUITA:
                return "Gratuita";
            default:
                throw new IllegalStateException("Unknown delivery type");
        }
    }

    public double cost() {
        switch (tip) {
            case STANDARD:
                return 5 + 0.5 * greutateKg + 0.1 * distantaKm;
            case EXPRESS:
                return 12 + 1.0 * greutateKg + 0.25 * distantaKm;
            case GRATUITA:
                return 0;
            default:
                throw new IllegalStateException("Unknown delivery type");
        }
    }
}
