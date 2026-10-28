package exemple.strategy;

public class PlataNumerar implements MetodaPlata {

    @Override
    public String getNume() {
        return "Numerar";
    }

    @Override
    public double taxa(double suma) {
        return 0;
    }
}
