package app.ex4.models;

public class SmsCuTrunchiere implements Notificator {
    private final int lungimeMaxima;

    public SmsCuTrunchiere(int lungimeMaxima) {
        if (lungimeMaxima <= 0) {
            throw new IllegalArgumentException("Length limit must be positive");
        }
        this.lungimeMaxima = lungimeMaxima;
    }

    @Override
    public String getNume() {
        return "SMS + trunchiere";
    }

    @Override
    public void trimite(String mesaj) {
        if (mesaj == null || mesaj.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }
        if (mesaj.length() > lungimeMaxima) {
            mesaj = mesaj.substring(0, lungimeMaxima);
        }
        if (mesaj.length() > NotificatorSms.LUNGIME_MAXIMA) {
            throw new IllegalArgumentException("Message exceeds SMS length limit");
        }
        System.out.println("[SMS] " + mesaj);
    }
}
