/*
    Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico
    com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular.
    A classe deve receber altura e largura como parâmetros.
*/

package ex2;

public class Main {
    public static void main(String args[]){
        CalculadoraSalaRetangular sala1 = new CalculadoraSalaRetangular();

        System.out.println("A área da sala é " + sala1.calcularArea(3, 10));
        System.out.println("O perímetro da sala é " + sala1.calcularPerimetro(3, 10));
    }
}
