package org.example;

public class Peixe {

    private String especie;
    private String cor;
    private double tamanho;


    public Peixe(String especie, String cor, double tamanho) {
        this.especie = especie;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public void nadar() {
        System.out.println("O peixe está nadando!");
    }

    public void comer() {
        System.out.println("O peixe está comendo.");
    }

    public void exibirInfo() {
        System.out.println("Espécie: " + especie);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
    }
}