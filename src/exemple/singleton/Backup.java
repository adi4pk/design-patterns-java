package exemple.singleton;

public class Backup {

    public void ruleaza() {
        Jurnal.getInstance().scrie("Backup pornit");
    }
}
