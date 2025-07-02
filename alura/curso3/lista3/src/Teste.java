/*
    ex1:
    Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
*/

import br.com.alura.exercicios.ex23.Animal;
import br.com.alura.exercicios.ex23.Cachorro;
import br.com.alura.exercicios.ex4.Produto;
import br.com.alura.exercicios.ex5.Circulo;
import br.com.alura.exercicios.ex5.Forma;
import br.com.alura.exercicios.ex5.Quadrado;
import br.com.alura.exercicios.ex6.ContaBancaria;

import java.util.ArrayList;

public class Teste {
    public static void main(String args[]){
        //ex1
        ArrayList<String> fisica = new ArrayList<>();
        fisica.add("elétron");
        fisica.add("Próton");
        fisica.add("Neutron");
        fisica.add("Spin");
        fisica.add("Constante de Planck");
        fisica.forEach(System.out::println);
        System.out.println();

        // ex2 e ex3:
        Cachorro cachorro = new Cachorro();
        Animal animal1 = new Cachorro();

        Animal animal = (Animal) cachorro;
        if(animal1 instanceof Cachorro){
            Cachorro cachorro1 = (Cachorro) animal1;
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
        System.out.println();

        //ex4:
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Coador", 24.90));
        listaProdutos.add(new Produto("Smartwatch", 149.90));
        listaProdutos.add(new Produto("Quadro", 41.90));

        for(Produto item: listaProdutos){
            System.out.println(item);
        }
        System.out.println(Produto.getPrecoMedio());
        System.out.println();

        // ex5:
        ArrayList<Forma> listaGeometrica = new ArrayList<>();
        listaGeometrica.add(new Quadrado(5));
        listaGeometrica.add(new Circulo(5));
        listaGeometrica.add(new Quadrado(3));
        listaGeometrica.add(new Circulo(3));
        listaGeometrica.add(new Quadrado(1));
        listaGeometrica.add(new Circulo(1));

        for(Forma item: listaGeometrica){
            System.out.println(item.calcularArea());
        }
        System.out.println();

        //ex6:
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria(1, 14523));
        contas.add(new ContaBancaria(2, 581.62));
        contas.add(new ContaBancaria(3, 80456));
        contas.add(new ContaBancaria(4, 2101));
        contas.add(new ContaBancaria(5, 1454));
        contas.add(new ContaBancaria(6, 12.21));
        ContaBancaria maiorConta = contas.getFirst();

        for (ContaBancaria item : contas){
            if(maiorConta.getSaldo() < item.getSaldo()){
                maiorConta = item;
            }
        }
        System.out.println("Conta com maior saldo: \n" + maiorConta);


    }
}
