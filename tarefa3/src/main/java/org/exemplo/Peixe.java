package org.exemplo;

public class Peixe {

    private String especie;
    private String cor;
    private double tamanho;


    public Peixe(String especie, String cor, double tamanho) {
        this.especie = especie;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String alimentar() {
        return("O peixe " + especie + " da cor " + cor + " e com " + tamanho +" de tamanho está comendo!");
    }

    public String nadar() {
        return("O peixe " + especie + " da cor " + cor + " e com " + tamanho +" de tamanho está nadando!");
    }

     }
