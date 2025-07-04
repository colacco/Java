package br.com.alura.exercicios;

/*
    1.
    Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade.
    Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON
    representando uma pessoa em um objeto do tipo Pessoa.

    2.
    Modifique o programa do Exercício anterior para permitir a conversão de um JSON
    mesmo se alguns campos estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa.
    Consulte a documentação da biblioteca Gson para flexibilizar a conversão.
*/

public record Pessoa(String nome, int idade, String cidade) {
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Cidade: " + cidade;
    }
}
