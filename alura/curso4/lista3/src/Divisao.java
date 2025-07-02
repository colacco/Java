/*
    1.
    Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
    Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
*/


import java.util.Scanner;

public class Divisao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.print("Insira um número para dividir: ");
        num1 = scanner.nextDouble();
        System.out.print("Insira o divisor (sem ser 0): ");

        try{
            num2 = scanner.nextDouble();
            if(num2 == 0){
                throw new ArithmeticException();
            }

            resultado = num1 / num2;
            System.out.println("O resultado é: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("O número não pode ser dividido por zero.");
        }

        System.out.println("Fim!");
    }
}
