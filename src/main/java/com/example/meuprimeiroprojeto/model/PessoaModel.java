package com.example.meuprimeiroprojeto.model;

public class Pessoa {
    private String nome;
    private int idade;
    private String localNascimento;

    public Pessoa(){};

    public Pessoa(String nome, int idade, String localNascimento){
        this.nome = nome;
        this.idade = idade;
        this.localNascimento = localNascimento;
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

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }
}}