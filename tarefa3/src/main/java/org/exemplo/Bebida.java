package org.exemplo;

public class Bebida{

    private String nome;
    private double volume;
    private String tipo;

    public Bebida(String nome, double volume, String tipo) {
        this.nome = nome;
        this.volume = volume;
        this.tipo = tipo;
    }

    public String abrir() {
        return("A bebida " + nome + " de " + volume + " ml, foi aberta!");
    }

    public String beber() {
        return ("Você está bebendo " + volume + " ml de " + nome + "!");
    }

    // get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}