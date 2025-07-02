/*
    Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade
    e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados.
    Crie um objeto ProdutoPerecivel e imprima seus valores.
*/

package br.com.alura.exercicios.ex4;
import br.com.alura.exercicios.ex123.Produto;

public class ProdutoPerecivel extends Produto {
    private String dataValide;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValide){
        super(nome, preco, quantidade);
        this.dataValide = dataValide;
    }

    @Override
    public String toString(){
        return "\n Nome: " + getNome() + "\n Preço: " + getPreco() + "\n Quantidade: " + getQuantidade() + "\n Data de validade: " + dataValide;
    }
}
