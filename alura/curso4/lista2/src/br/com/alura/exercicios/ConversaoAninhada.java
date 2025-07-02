package br.com.alura.exercicios;

/*
    Crie uma classe Livro que contenha atributos como título, autor e um objeto representando a editora.
    Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado
    representando um livro em um objeto do tipo Livro.
*/

import com.google.gson.Gson;

record Editora(String nome, String cidade) {}
record Livro(String titulo, String autor, Editora editora) {}

public class ConversaoAninhada {
    public static void main(String[] args){
        String mensagem = "{\"titulo\":\"Aprendendo a aprender\", \"autor\":\"Barbara Oakley\", \"editora\":{\"nome\":\"Atena\",\"cidade\":\"Não sei\"}}";
        Gson gson = new Gson();
        Livro livro = gson.fromJson(mensagem, Livro.class);
        System.out.println(livro);
    }
}

