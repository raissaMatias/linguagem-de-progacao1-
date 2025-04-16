package org.exemplo;

public class Rede {
    private String nome;

    public Rede(String nome) {
        this.nome = nome;
    }

    public String adicionar() {
        return("O usuário  " + nome + "foi adicionado");
    }

    public String remover() {
        return("O usuário " + nome + " foi removido!");
    }

    // get o nome
    public String getNome() {
        return nome;

    }
}
