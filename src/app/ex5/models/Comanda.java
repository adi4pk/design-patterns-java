package app.ex5.models;

public class Comanda {
    private final String client;
    private final String adresa;
    private final String nota;
    private final String cupon;
    private final boolean express;
    private final boolean cadou;

    public Comanda(String client, String adresa, String nota, String cupon,
                   boolean express, boolean cadou) {
        if (client == null || client.isBlank()) {
            throw new IllegalArgumentException("Client is required");
        }
        if (adresa == null || adresa.isBlank()) {
            throw new IllegalArgumentException("Address is required");
        }
        if (cadou && (nota == null || nota.isBlank())) {
            throw new IllegalArgumentException("Gift wrap requires a note");
        }
        this.client = client;
        this.adresa = adresa;
        this.nota = nota;
        this.cupon = cupon;
        this.express = express;
        this.cadou = cadou;
    }

    public String getClient() {
        return client;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getNota() {
        return nota;
    }

    public String getCupon() {
        return cupon;
    }

    public boolean isExpress() {
        return express;
    }

    public boolean isCadou() {
        return cadou;
    }

    public String descriere() {
        String text = "Comanda " + client + " -> " + adresa;
        if (nota != null) {
            text += " | nota: " + nota;
        }
        if (cupon != null) {
            text += " | cupon: " + cupon;
        }
        if (express) {
            text += " | express";
        }
        if (cadou) {
            text += " | cadou";
        }
        return text;
    }
}
