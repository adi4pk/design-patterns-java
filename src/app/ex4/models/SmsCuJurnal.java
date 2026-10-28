package app.ex4.models;

public class SmsCuJurnal implements Notificator {

    @Override
    public String getNume() {
        return "SMS + jurnal";
    }

    @Override
    public void trimite(String mesaj) {
        if (mesaj == null || mesaj.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }
        System.out.println("[JURNAL] catre SMS: " + mesaj);
        if (mesaj.length() > NotificatorSms.LUNGIME_MAXIMA) {
            throw new IllegalArgumentException("Message exceeds SMS length limit");
        }
        System.out.println("[SMS] " + mesaj);
    }
}
