package app.ex6.models;

public class GeneratorNumere {
    private int ultimul = 1000;

    public int urmatorul() {
        ultimul++;
        return ultimul;
    }
}
