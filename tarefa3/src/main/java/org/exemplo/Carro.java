package org.exemplo;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private boolean vendido;

    // Construtor
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.vendido = false; // por padrão, o carro não está vendido
    }

    // 2 metodos

    public void vender() {
        vendido = true;
        System.out.println("A loja não possui o carro " + modelo + " do ano " + ano + " da cor " + cor +  " disponível");
    }

    public void naoVendido() {
        vendido = false;
        System.out.println("A loja possui o carro " + modelo + " do ano " + ano + " da cor " + cor +  " disponível");
    }

    // get
    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public boolean isVendido() {
        return vendido;
    }

    // exibindo info
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Status: " + (vendido ? "Vendido" : "Disponível"));
    }
}
