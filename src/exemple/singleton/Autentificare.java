package exemple.singleton;

public class Autentificare {

    public void login(String utilizator) {
        Jurnal.getInstance().scrie("Login: " + utilizator);
    }
}
