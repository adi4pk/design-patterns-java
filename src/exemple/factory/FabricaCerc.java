package exemple.factory;

public class FabricaCerc implements FabricaForma {

    @Override
    public String getTip() {
        return "CERC";
    }

    @Override
    public Forma creeaza(double dimensiune) {
        return new Cerc(dimensiune);
    }
}
