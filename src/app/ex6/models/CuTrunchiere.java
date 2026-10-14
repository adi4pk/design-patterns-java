package app.ex6.models;

public class CuTrunchiere implements Notificator {
    private final int lungimeMaxima;
    private final Notificator interior;

    public CuTrunchiere(int lungimeMaxima, Notificator interior) {
        if (lungimeMaxima <= 0) {
            throw new IllegalArgumentException("Length limit must be positive");
        }
        if (interior == null) {
            throw new IllegalArgumentException("Inner notifier is required");
        }
        this.lungimeMaxima = lungimeMaxima;
        this.interior = interior;
    }

    @Override
    public String getNume() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void trimite(String mesaj) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
