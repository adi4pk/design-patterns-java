package exemple.strategy;

public class Cos {
    private final double total;
    private MetodaPlata metoda;

    public Cos(double total, MetodaPlata metoda) {
        this.total = total;
        this.metoda = metoda;
    }

    public void schimbaMetoda(MetodaPlata noua) {
        this.metoda = noua;
    }

    public double dePlata() {
        return total + metoda.taxa(total);
    }

    public String getMetoda() {
        return metoda.getNume();
    }
}
