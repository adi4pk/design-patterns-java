package app.ex6.models;

public class CuPrefix implements Notificator {
    private final String prefix;
    private final Notificator interior;

    public CuPrefix(String prefix, Notificator interior) {
        if (prefix == null || prefix.isEmpty()) {
            throw new IllegalArgumentException("Prefix cannot be empty");
        }
        if (interior == null) {
            throw new IllegalArgumentException("Inner notifier is required");
        }
        this.prefix = prefix;
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
