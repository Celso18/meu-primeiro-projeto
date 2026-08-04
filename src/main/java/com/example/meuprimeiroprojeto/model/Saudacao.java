package com.example.meuprimeiroprojeto.model;

// Vai representar a estrutura do dado que queremos retornar
public class Saudacao {
    // Atributos dos nossos dados
    private String nome;
    private String mensagem;

    public Saudacao(){};

    public Saudacao(String nome, String mensagem){
        this.nome = nome;
        this.mensagem = mensagem;
    }

    // Gets e Sets são OBRIGATÓRIOS
    // O Spring usa esses métodos para montar o nosso JSON
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}