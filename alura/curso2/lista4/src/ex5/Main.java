/*
    Crie uma interface Calculavel com um metodo double calcularPrecoFinal().
    Implemente essa interface nas classes Livro e ProdutoFisico,
    cada uma retornando o preço final considerando descontos ou taxas adicionais.
*/
package ex5;

public class Main {
    public static void main(String args[]){
        Livro livro = new Livro();
        ProdutoFisico pfisico = new ProdutoFisico();

        livro.setPreco(50.3);
        livro.setFisico(true);
        livro.setTaxaDeEntrega(5.4);
        System.out.println(livro.calcularPrecoFinal());

        pfisico.setPreco(120.4);
        pfisico.setImposto(0.0054); // Retirado do site enotas.com.br
        pfisico.setTaxaDeEntrega(10.5);
        System.out.println(pfisico.calcularPrecoFinal());
    }
}
