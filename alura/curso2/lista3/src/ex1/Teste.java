/*
    Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
    Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
    Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
*/
package ex1;

public class Teste {
    public static void main(String args[]){
        ModeloCarro carro1 = new ModeloCarro();

        carro1.setCor("Amarelo");
        carro1.setPrecomedio(90000, 85400, 80000 );
        System.out.println(carro1.menorpreco());
        System.out.println(carro1.maiorpreco());
        System.out.println(carro1.getCor());
    }
}
