package ex5;

public class ProdutoFisico extends Produto implements Calculavel{
    public double calcularPrecoFinal() {
        return preco * (1 + imposto) + taxaDeEntrega;
    }
}
