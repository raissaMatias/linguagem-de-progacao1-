package org.exemplo;

public class Passaro {
    // Atributos
    private String especie;
    private double peso;
    private String cor;

    // Construtor
    public Passaro (String especie, double peso, String cor) {
        this.especie = especie;
        this.peso = peso;
        this.cor = cor;
    }

    // Métodos
    public String cantar() {
        return("O passarro  " + especie + " está cantando");
    }

    public String dormir() {
        return("O pássaro " + especie + " está dormindo !");
    }

    public String voar() {return("O pássaro " + especie + "está voando");
}

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}