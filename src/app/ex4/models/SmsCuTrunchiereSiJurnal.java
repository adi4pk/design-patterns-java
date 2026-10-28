package app.ex4.models;

public class SmsCuTrunchiereSiJurnal implements Notificator {
    private final int lungimeMaxima;

    public SmsCuTrunchiereSiJurnal(int lungimeMaxima) {
        if (lungimeMaxima <= 0) {
            throw new IllegalArgumentException("Length limit must be positive");
        }
        this.lungimeMaxima = lungimeMaxima;
    }

    @Override
    public String getNume() {
        return "SMS + trunchiere + jurnal";
    }

    @Override
    public void trimite(String mesaj) {
        if (mesaj == null || mesaj.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }
        System.out.println("[JURNAL] catre SMS + trunchiere: " + mesaj);
        if (mesaj.length() > lungimeMaxima) {
            mesaj = mesaj.substring(0, lungimeMaxima);
        }
        if (mesaj.length() > NotificatorSms.LUNGIME_MAXIMA) {
            throw new IllegalArgumentException("Message exceeds SMS length limit");
        }
        System.out.println("[SMS] " + mesaj);
    }
}
