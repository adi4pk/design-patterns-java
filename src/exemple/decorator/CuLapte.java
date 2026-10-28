package exemple.decorator;

public class CuLapte implements Bautura {
    private final Bautura interior;

    public CuLapte(Bautura interior) {
        this.interior = interior;
    }

    @Override
    public String descriere() {
        return interior.descriere() + " + lapte";
    }

    @Override
    public double pret() {
        return interior.pret() + 2;
    }
}
