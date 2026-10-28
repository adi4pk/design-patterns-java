package exemple.factory;

public interface FabricaForma {
    String getTip();

    Forma creeaza(double dimensiune);
}
