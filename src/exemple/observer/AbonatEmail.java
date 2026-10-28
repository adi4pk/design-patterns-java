package exemple.observer;

public class AbonatEmail implements Abonat {

    @Override
    public void notifica(String titlu) {
        System.out.println("[EMAIL] Video nou pe canal: " + titlu);
    }
}
