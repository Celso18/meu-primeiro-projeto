package com.example.meuprimeiroprojeto.model;

public class PessoaModel {

    private String nome;
    private int idade;
    private String cidade;

    public PessoaModel(){}

    // Construtor necessário para o HelloWorldController funcionar
    public PessoaModel(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    // Getters e Setters para o Spring Boot conseguir ler os dados
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
