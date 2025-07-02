/*
    ex1:
    Crie uma lista de números inteiros e utilize o metodo
    Collections.sort para ordená-la em ordem crescente.
    Em seguida, imprima a lista ordenada.
    ex4:
    Crie uma lista utilizando a interface List e instancie-a
    tanto como ArrayList quanto como LinkedList. Adicione
    elementos e imprima a lista, mostrando que é possível
    trocar facilmente a implementação.
    ex5:
    Modifique o Exercício 4 para declarar a variável de lista
    como a interface List, demonstrando o uso de polimorfismo.
*/


import br.com.alura.exercicios.ex23.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Teste {
    public static void main(String[] args){
        //ex1:
        // Colocar apenas int o ArrayList não aceita pelo fato de aceitar objetos.
        // Então, torna-se necessário colocar Integer (Classe que contém o tipo primitivo int).
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(5);
        listaNumeros.add(4);
        listaNumeros.add(2);
        listaNumeros.add(1);
        listaNumeros.add(8);
        listaNumeros.add(7);
        listaNumeros.add(3);
        listaNumeros.add(0);
        listaNumeros.add(9);
        listaNumeros.add(6);
        Collections.sort(listaNumeros);
        System.out.println("Lista ordenada: " + listaNumeros);
        System.out.println();

        //ex2 e ex3:
        ArrayList<Titulo> listaTitulo = new ArrayList<>();
        listaTitulo.add(new Titulo("Java para leigos"));
        listaTitulo.add(new Titulo("Calculo I - Stewart"));
        listaTitulo.add(new Titulo("O Homem e seus Simbolos"));
        listaTitulo.add(new Titulo("Investidor Inteligente"));
        Collections.sort(listaTitulo);
        System.out.println(listaTitulo); // A alura optou por um for, mas eu achei mais interessante usar esse toString() para treinar.
        System.out.println();

        //ex4:
        List<String> lista = new ArrayList<>();
        lista.add("Luffy");
        lista.add("Zoro");
        lista.add("Sanji");
        System.out.println("Lista como uma ArrayList: " + lista);

        lista = new LinkedList<>();
        lista.add("Usopp");
        lista.add("Nami");
        lista.add("Chopper");
        System.out.println("Lista como uma LinkedList: " + lista);
        System.out.println();

        //ex5:


    }
}
