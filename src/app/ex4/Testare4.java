package app.ex4;

import app.ex4.models.EmailCuPrefix;
import app.ex4.models.Notificator;
import app.ex4.models.NotificatorSms;
import app.ex4.models.SmsCuJurnal;
import app.ex4.models.SmsCuTrunchiere;
import app.ex4.models.SmsCuTrunchiereSiJurnal;

public class Testare4 {

    public static void ruleaza() {
        String scurt = "Tema e corectata";
        String lung = "Tema noua: Observer, de predat vineri";
        Notificator urgent = new EmailCuPrefix("[URGENT] ");
        System.out.println(urgent.getNume());
        urgent.trimite(scurt);
        try {
            new NotificatorSms().trimite(lung);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        Notificator taiat = new SmsCuTrunchiere(30);
        System.out.println(taiat.getNume());
        taiat.trimite(lung);
        Notificator jurnal = new SmsCuJurnal();
        System.out.println(jurnal.getNume());
        jurnal.trimite(scurt);
        Notificator taiatSiJurnal = new SmsCuTrunchiereSiJurnal(30);
        System.out.println(taiatSiJurnal.getNume());
        taiatSiJurnal.trimite(lung);
    }
}
