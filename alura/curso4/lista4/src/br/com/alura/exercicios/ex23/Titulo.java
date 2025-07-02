package br.com.alura.exercicios.ex23;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
    }

}
