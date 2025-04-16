package org.exemplo;

public class Sapato {

    private String tipo;
    private String cor;
    private double tamanho;

    public Sapato (String tipo, String cor, double tamanho) {
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String calcar() {
        return("O sapato " + tipo + " da cor "+ cor + ", do tamanho " + tamanho + " está calçado!");
    }
    public String descalcar() { return("O sapato " + tipo + " da cor ,"+ cor + ", do tamanho " + tamanho + " NÃO está calçado!");
    }

    // get and set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}