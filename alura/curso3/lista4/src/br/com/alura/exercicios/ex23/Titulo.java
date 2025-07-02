/*
    ex2:
    Crie uma classe Titulo com um atributo nome do tipo String.
    Implemente a interface Comparable na classe para que seja
    possível ordenar uma lista de objetos Titulo.

    ex3:
    No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista.
    Utilize o metodo Collections.sort para ordenar a lista e,
    em seguida, imprima os títulos ordenados.
*/

package br.com.alura.exercicios.ex23;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.nome.compareTo(titulo.nome);
    }
}
