package app.ex6.models;

public class CuJurnal implements Notificator {
    private final Notificator interior;

    public CuJurnal(Notificator interior) {
        if (interior == null) {
            throw new IllegalArgumentException("Inner notifier is required");
        }
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
