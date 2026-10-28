package exemple.decorator;

public class CuCaramel implements Bautura {
    private final Bautura interior;

    public CuCaramel(Bautura interior) {
        this.interior = interior;
    }

    @Override
    public String descriere() {
        return interior.descriere() + " + caramel";
    }

    @Override
    public double pret() {
        return interior.pret() + 3;
    }
}
