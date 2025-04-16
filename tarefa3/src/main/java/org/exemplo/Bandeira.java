package org.exemplo;

public class Bandeira {
    // Atributos
    private String pais;
    private double tamanho;

    // Construtor
    public Bandeira(String pais, double tamanho) {
        this.pais = pais;
        this.tamanho = tamanho;
    }

    // Métodos
    public String hastear() {
        return "A bandeira do " + pais + " de tamanho " + tamanho + " está hasteada!";
    }

    public String baixar() {
        return "A bandeira do " + pais + " de tamanho " + tamanho + " está baixada!";
    }

    public String cmmedir() {
        return "Bandeira tem " + tamanho + " cm";
    }

    public String mmedir() {
        return "Bandeira tem " + tamanho + " m";
    }

    // Getters e Setters
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
