package ex6;

public class Item {
    protected String nome;
    protected double preco;
    protected int quantidade;
    protected boolean temDesconto;
    protected double desconto;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setTemDesconto(boolean temDesconto) {
        this.temDesconto = temDesconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
