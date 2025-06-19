/*
    Crie uma interface Vendavel com métodos para calcular o preço total de um produto
    com base na quantidade comprada e aplicar descontos.
    Implemente essa interface nas classes Produto e Servico,
    cada uma fornecendo a sua própria lógica de cálculo de preço.
*/

package ex6;

public class Main {
    public static void main(String args[]){
        Produto produto = new Produto();
        Servico servico = new Servico();

        produto.setPreco(79.5);
        produto.setImposto(0.0054);
        produto.aplicarDescontos(20);
        produto.setQuantidade(2);
        produto.setTaxaDeEntrega(12.9);
        produto.setTemDesconto(true);
        produto.setEntrega(true);
        System.out.println(produto.precoTotal());

        produto.setTemDesconto(false);
        System.out.println(produto.precoTotal());

        produto.setEntrega(false);
        System.out.println(produto.precoTotal());

        servico.setPreco(50.99);
        servico.setQuantidade(40);
        servico.aplicarDescontos(35);
        servico.setTemDesconto(true);
        System.out.println(servico.precoTotal());
    }
}
