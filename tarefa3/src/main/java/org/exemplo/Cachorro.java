package org.exemplo;

public class Cachorro {

    // 3 atributos
    private String nome;
    private String tamanho;
    private String temperamento;

    // 3 construtores
    public Cachorro(String nome, String tamanho, String temperamento) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.temperamento = temperamento;
    }

    // 2 metodos
    public void exibirInformacoes() {
        System.out.println("Raça: " + nome);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Temperamento: " + temperamento);
    }

    public String alimentar() {
        return("O cachorro de nome " + nome + ", temperamento " + temperamento + " e de porte " + tamanho + " está comendo!");
    }

    public String brincar() {
       return("O cachorro de nome " + nome + ", temperamento " + temperamento + " e de porte " + tamanho +  " está brincando!");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }
}
