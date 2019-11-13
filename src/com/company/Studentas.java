package com.company;

public class Studentas {
    private int  id;
    private String vardas;
    private String pavarde;
    private String grupe;

    public Studentas(int id, String vardas, String pavarde, String grupe) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.grupe = grupe;
    }

    public int getId() {
        return id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getGrupe() {
        return grupe;
    }

    public void setGrupe(String grupe) {
        this.grupe = grupe;
    }

    @Override
    public String toString() {
        return new String(id + " " + vardas + " " + pavarde + " " + grupe);
    }
}
