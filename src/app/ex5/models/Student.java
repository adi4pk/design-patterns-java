package app.ex5.models;

public class Student extends Utilizator {
    private final String an;

    public Student(String prenume, String nume, String an) {
        super(prenume, nume);
        if (an == null || an.isBlank()) {
            throw new IllegalArgumentException("Study year cannot be empty");
        }
        this.an = an;
    }

    public String getAn() {
        return an;
    }

    @Override
    public String descriere() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
