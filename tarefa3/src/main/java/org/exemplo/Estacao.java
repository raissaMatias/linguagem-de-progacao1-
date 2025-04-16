package org.exemplo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Estacao{
    // 4 atributos
    private String nome;
    private String clima;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    // 4 construtores
    public Estacao(String nome, String clima, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.clima = clima;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // 3 métodos
    public void iniciar() {
        System.out.println("A estação " + nome + " iniciou!");
    }

    public void terminar() {
        System.out.println("A estação " + nome + " terminou!");
    }

    public long calcular() {
        return ChronoUnit.DAYS.between(dataInicio, dataFim);
    }

    // get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
}
