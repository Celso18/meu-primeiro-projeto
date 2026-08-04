package com.example.meuprimeiroprojeto.controller;

import com.example.meuprimeiroprojeto.model.Saudacao;
import org.springframework.web.bind.annotation.*;

//Classe java é responsavel por fazer requisições web e devolver respostas
//Por padrão, essas respostas são em formato de texto JSON

/**
 * Requisições HTTP:
 *  GET -> Ler -> Solicita dados específicos no servidor.
 *  POST -> Criar -> Envia dados para o servidor.
 *  PUT -> Subsitui -> Atualiza algum dado no meu servidor
 *  DELETE -> Apaga -> Remove algum recurso do servidor.
 */

@RestController
public class HelloWorldController {

    //metodo get retornando um texto no endpoint padrão
    @GetMapping("/")
    public String helloWorld(){
        return "Olá mundo! Meu primeiro projeto Spring Boot está funcionando.";
    }

    //metodo get retornando um texto em outro enpoint
    @GetMapping("/textoInfo")
    public String textoInformativo(){
        return "Essa página, está sendo acessada pelo /textoInfo";
    }

    //instânciando objeto inserindo o nome como parâmentro do getMapping
    @GetMapping("/saudacaoNome/{nome}")
    public Saudacao saudarComNome(@PathVariable String nome){
        String mensagem = "Seja bem vindo:";

        return new Saudacao(mensagem, nome);
    }

    //instânciando Objeto inserindo informações direto
    @GetMapping("/saudacaoObjeto")
    public Saudacao saudarComObjeto(){
        return new Saudacao("João", "Seja mundo bem vindo!");
    }

    /**
     * Exemplo de POST: Recebendo um objeto JSON e retornando ele mesmo
     * Endpoint: http://localhost:8080/criarSaudacao
     */
    @PostMapping("/criarSaudacao")
    public Saudacao criarSaudacao(@RequestBody Saudacao novaSaudacao) {
        // Aqui você poderia salvar no banco de dados, por exemplo.
        // Vamos apenas alterar a mensagem para provar que passou por aqui:
        String mensagemModificada = novaSaudacao.getMensagem();
        novaSaudacao.setMensagem(mensagemModificada);

        return novaSaudacao; // O Spring converte o objeto de volta para JSON
    }
}

