/*
    Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
    Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface
    com as fórmulas de conversão e exibe os resultados.*/

package ex4;

public class Main {
    public static void main(String args[]){
        ConversorTemperaturaPadrao temp1 = new ConversorTemperaturaPadrao();

        System.out.println(temp1.celsiusParaFahrenheit(20));
        System.out.println(temp1.fahrenheitParaCelsius(20));
    }
}
