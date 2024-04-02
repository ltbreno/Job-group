package com.example.provaangelo;

public class Estagiario {
    private String nome;
    private int idade;
    private String periodo;

    public Estagiario(String nome, int idade, String periodo) {
        this.nome = nome;
        this.idade = idade;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}

