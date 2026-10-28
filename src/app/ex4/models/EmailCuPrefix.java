package app.ex4.models;

public class EmailCuPrefix implements Notificator {
    private final String prefix;

    public EmailCuPrefix(String prefix) {
        if (prefix == null || prefix.isEmpty()) {
            throw new IllegalArgumentException("Prefix cannot be empty");
        }
        this.prefix = prefix;
    }

    @Override
    public String getNume() {
        return "Email + prefix";
    }

    @Override
    public void trimite(String mesaj) {
        if (mesaj == null || mesaj.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }
        System.out.println("[EMAIL] " + prefix + mesaj);
    }
}
