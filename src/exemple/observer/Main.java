package exemple.observer;

public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal();
        Abonat telefon = new AbonatTelefon();
        canal.aboneaza(telefon);
        canal.aboneaza(new AbonatEmail());
        canal.publica("Intro in Java");
        canal.dezaboneaza(telefon);
        canal.publica("Colectii");
    }
}
