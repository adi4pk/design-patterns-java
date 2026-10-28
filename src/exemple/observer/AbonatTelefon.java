package exemple.observer;

public class AbonatTelefon implements Abonat {

    @Override
    public void notifica(String titlu) {
        System.out.println("[TELEFON] Video nou: " + titlu);
    }
}
