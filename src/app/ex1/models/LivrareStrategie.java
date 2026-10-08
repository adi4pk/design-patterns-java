package app.ex1.models;

public interface LivrareStrategie {
    String getNume();

    double calculeazaCost(double greutateKg, double distantaKm);
}
