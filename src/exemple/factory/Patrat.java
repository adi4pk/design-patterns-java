package exemple.factory;

public class Patrat implements Forma {
    private final double latura;

    public Patrat(double latura) {
        this.latura = latura;
    }

    @Override
    public String descriere() {
        return "Patrat cu latura " + latura;
    }
}
