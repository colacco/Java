/*
    ex1:
    Crie uma classe Produto com atributos como nome, preco, e quantidade.
    Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
    Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

    ex2:
    Implemente o metodo toString() na classe Produto para retornar uma representação em texto do objeto.
    Em seguida, imprima a lista de produtos utilizando o metodo System.out.println().

    ex3:
    Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos.
    Em seguida, crie objetos Produto utilizando esse novo construtor.
*/

package br.com.alura.exercicios.ex123;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " Preço: " + preco + " Quantidade: " + quantidade;
    }
}
