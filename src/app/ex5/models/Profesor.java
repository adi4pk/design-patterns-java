package app.ex5.models;

public class Profesor extends Utilizator {
    private final String catedra;

    public Profesor(String prenume, String nume, String catedra) {
        super(prenume, nume);
        if (catedra == null || catedra.isBlank()) {
            throw new IllegalArgumentException("Department cannot be empty");
        }
        this.catedra = catedra;
    }

    public String getCatedra() {
        return catedra;
    }

    @Override
    public String descriere() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
