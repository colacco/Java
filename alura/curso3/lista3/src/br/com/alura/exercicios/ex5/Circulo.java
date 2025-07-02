package br.com.alura.exercicios.ex5;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return raio * raio * Math.PI;
    }
}
