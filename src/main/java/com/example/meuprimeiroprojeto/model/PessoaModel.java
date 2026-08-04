package com.example.meuprimeiroprojeto.model;

//ela vai ser um modelo de criação pra objetos
//do tipo PESSOA
public class PessoaModel {
    private String nome;
    private int idade;
    private String cidadeNascimento;

    //metodo construtor vazio
    //Vai ser utilizado na requisição POST, PUT e DELETE
    public PessoaModel(){};

    public PessoaModel(String nome, int idade, String cidadeNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeNascimento = cidadeNascimento;
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

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }
}