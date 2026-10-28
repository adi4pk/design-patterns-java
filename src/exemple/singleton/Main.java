package exemple.singleton;

public class Main {
    public static void main(String[] args) {
        Autentificare autentificare = new Autentificare();
        Backup backup = new Backup();
        autentificare.login("ana");
        backup.ruleaza();
        autentificare.login("ion");
        System.out.println("Linii in jurnal: " + Jurnal.getInstance().numarLinii());
        System.out.println("Aceeasi instanta: "
                + (Jurnal.getInstance() == Jurnal.getInstance()));
    }
}
