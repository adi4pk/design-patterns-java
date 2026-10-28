package exemple.factory;

public class Cerc implements Forma {
    private final double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    @Override
    public String descriere() {
        return "Cerc cu raza " + raza;
    }
}
