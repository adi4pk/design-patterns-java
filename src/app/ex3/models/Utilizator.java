package app.ex3.models;

public abstract class Utilizator {
    private final String prenume;
    private final String nume;

    protected Utilizator(String prenume, String nume) {
        if (prenume == null || prenume.isBlank()) {
            throw new IllegalArgumentException("First name cannot be empty");
        }
        if (nume == null || nume.isBlank()) {
            throw new IllegalArgumentException("Last name cannot be empty");
        }
        this.prenume = prenume;
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public abstract String descriere();
}
