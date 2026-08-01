package com.example.meuprimeiroprojeto.controller;

import com.example.meuprimeiroprojeto.model.PessoaModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/objetoPessoa")
    public PessoaModel objetoPessoa() {
        // CORREÇÃO: Ordem dos parâmetros ajustada para (Nome, Idade, Cidade)
        return new PessoaModel("João", 22, "Luziânia");
    }

    @GetMapping("/")
    public String inicio() {
        return "Aplicação Spring Boot está funcionando.";
    }
}

