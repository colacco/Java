/*
    Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos().
    Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos.
    Adicione um metodo específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.
*/


package ex04;

import java.sql.SQLOutput;

public class Main {
    public static void main(String args[]){
        VerificadorPrimo num1 = new VerificadorPrimo();
        GeradorPrimo num2 = new GeradorPrimo();

        num1.verificarSeEhPrimo(97);
        num1.listarPrimos(70);
        System.out.println(num2.gerarProximoPrimo(7));
    }
}
