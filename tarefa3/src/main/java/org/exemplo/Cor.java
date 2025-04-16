package org.exemplo;

public class Cor {
    private String nome;

    public Cor(String nome) {
        this.nome = nome.toLowerCase();// padronizacao para caixa baixa
    }

    public boolean primaria() {
        return nome.equals("vermelho") || nome.equals("vermelha") || nome.equals("azul") || nome.equals("amarelo")|| nome.equals("amarela");
    }
    public boolean secundaria() {
        return nome.equals("laranja") || nome.equals("verde") || nome.equals("roxo") || nome.equals("roxa");
    }
    public boolean neutra() {
        return nome.equals("preto") || nome.equals("preta") || nome.equals("branco") || nome.equals("branca") || nome.equals("cinza");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome.toLowerCase();
    }
}