package exemple.builder;

public class Pizza {
    private final String dimensiune;
    private final String sos;
    private final boolean extraBranza;
    private final boolean ciuperci;

    private Pizza(Builder builder) {
        this.dimensiune = builder.dimensiune;
        this.sos = builder.sos;
        this.extraBranza = builder.extraBranza;
        this.ciuperci = builder.ciuperci;
    }

    public String descriere() {
        String text = "Pizza " + dimensiune;
        if (sos != null) {
            text += " | sos: " + sos;
        }
        if (extraBranza) {
            text += " | extra branza";
        }
        if (ciuperci) {
            text += " | ciuperci";
        }
        return text;
    }

    public static class Builder {
        private String dimensiune;
        private String sos;
        private boolean extraBranza;
        private boolean ciuperci;

        public Builder dimensiune(String dimensiune) {
            this.dimensiune = dimensiune;
            return this;
        }

        public Builder sos(String sos) {
            this.sos = sos;
            return this;
        }

        public Builder extraBranza() {
            this.extraBranza = true;
            return this;
        }

        public Builder ciuperci() {
            this.ciuperci = true;
            return this;
        }

        public Pizza build() {
            if (dimensiune == null || dimensiune.isBlank()) {
                throw new IllegalArgumentException("Size is required");
            }
            if (extraBranza && dimensiune.equals("mica")) {
                throw new IllegalArgumentException(
                        "Small pizza cannot have extra cheese");
            }
            return new Pizza(this);
        }
    }
}
