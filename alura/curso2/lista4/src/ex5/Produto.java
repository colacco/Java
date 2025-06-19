package ex5;

public class Produto {
    protected String nome;
    protected double preco;
    protected double taxaDeEntrega;
    protected double imposto;

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setTaxaDeEntrega(double taxaDeEntrega) {
        this.taxaDeEntrega = taxaDeEntrega;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
