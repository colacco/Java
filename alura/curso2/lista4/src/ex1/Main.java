/*
    Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira
    com o metodo converterDolarParaReal() para converter um valor em dólar para reais.
    A classe deve receber o valor em dólar como parâmetro.
*/

package ex1;

public class Main {
    public static void main(String args[]){
        ConversorMoeda teste = new ConversorMoeda();
        System.out.println(teste.converterDolarParaReal(10));
    }
}
