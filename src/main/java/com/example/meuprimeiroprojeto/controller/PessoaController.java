package com.example.meuprimeiroprojeto.controller;

import com.example.meuprimeiroprojeto.model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PessoaController {

    // Lista em memória que funciona como nosso "banco de dados" temporário
    private final ArrayList<Pessoa> pessoas = new ArrayList<>();

    // ==========================================
    // GET: Retorna todas as pessoas da lista
    // ==========================================
    @GetMapping("/pessoas")
    public ArrayList<Pessoa> mostrarTodasAsPessoas(){
        return pessoas;
    }

    // ==========================================
    // POST: Adiciona uma nova pessoa na lista
    // ==========================================
    @PostMapping("/novaPessoa")
    public Pessoa adicionarPessoa(@RequestBody Pessoa novaPessoa){
        pessoas.add(novaPessoa);
        return novaPessoa;
    }

    // ==========================================
    // PUT: Atualiza os dados de uma pessoa existente
    // Exemplo de URL: /atualizarPessoa/João
    // ==========================================
    @PutMapping("/atualizarPessoa/{nomeDaPessoa}")
    public Pessoa atualizarPessoa(@PathVariable String nomeDaPessoa, @RequestBody Pessoa pessoaAtualizada) {

        // Percorre a lista do índice 0 até o tamanho total da lista
        for (int i = 0; i < pessoas.size(); i++) {

            // Pega o elemento atual da lista na posição 'i'
            Pessoa pessoaAtual = pessoas.get(i);

            // Verifica se o nome da pessoa atual é igual ao nome buscado na URL
            if (pessoaAtual.getNome().equals(nomeDaPessoa)) {

                // Atualiza os dados da pessoa encontrada com os dados que vieram no corpo da requisição (RequestBody)
                pessoaAtual.setIdade(pessoaAtualizada.getIdade());
                pessoaAtual.setLocalNascimento(pessoaAtualizada.getLocalNascimento());
                // Se quiser permitir a mudança de nome também, basta descomentar a linha abaixo:
                // pessoaAtual.setNome(pessoaAtualizada.getNome());

                // Retorna a pessoa já modificada
                return pessoaAtual;
            }
        }

        // Se o for terminar e não encontrar ninguém com esse nome, retorna nulo
        return null;
    }

    // ==========================================
    // DELETE: Remove uma pessoa da lista
    // Exemplo de URL: /deletarPessoa/João
    // ==========================================
    @DeleteMapping("/deletarPessoa/{nomeDaPessoa}")
    public String deletarPessoa(@PathVariable String nomeDaPessoa) {

        // Percorre a lista novamente usando o for tradicional
        for (int i = 0; i < pessoas.size(); i++) {

            Pessoa pessoaAtual = pessoas.get(i);

            // Se encontrar a pessoa pelo nome
            if (pessoaAtual.getNome().equals(nomeDaPessoa)) {

                // Remove o elemento da lista usando o próprio índice 'i'
                pessoas.remove(i);

                // Retorna uma mensagem de sucesso
                return "Pessoa '" + nomeDaPessoa + "' foi removida com sucesso!";
            }
        }

        // Se não encontrar, avisa que a pessoa não existe
        return "Pessoa não encontrada na lista.";
    }
}