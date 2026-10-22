package app.ex1.models;

public class LivrareStandard implements LivrareStrategie {

    @Override
    public String getNume() {
        return "Standard";
    }

    @Override
    public double calculeazaCost(double greutateKg, double distantaKm) {

        double cost = (5 + 0.5 * greutateKg) + 0.1 * distantaKm;
        return cost;
    }
}
