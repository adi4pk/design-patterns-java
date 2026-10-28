package exemple.strategy;

public class PlataCard implements MetodaPlata {

    @Override
    public String getNume() {
        return "Card";
    }

    @Override
    public double taxa(double suma) {
        return suma * 0.015;
    }
}
