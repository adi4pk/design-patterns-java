package exemple.decorator;

public class Cafea implements Bautura {

    @Override
    public String descriere() {
        return "Cafea";
    }

    @Override
    public double pret() {
        return 8;
    }
}
