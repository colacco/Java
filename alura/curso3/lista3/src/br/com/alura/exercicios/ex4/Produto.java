/*
    ex4:
    Crie uma classe Produto com propriedades como nome e preço.
    Em seguida, crie uma lista de produtos e utilize um loop
    para calcular e imprimir o preço médio dos produtos.
*/

package br.com.alura.exercicios.ex4;

public class Produto {
    private static double precoTotal = 0;
    private static int quantidade;
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        precoTotal += preco;
        quantidade++;
    }

    public double getPreco() {
        return preco;
    }

    public static double getPrecoMedio() {
        return precoTotal/quantidade;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " (R$" + preco + ")\n";
    }
}
