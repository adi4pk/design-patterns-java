package exemple.factory;

public class FabricaPatrat implements FabricaForma {

    @Override
    public String getTip() {
        return "PATRAT";
    }

    @Override
    public Forma creeaza(double dimensiune) {
        return new Patrat(dimensiune);
    }
}
