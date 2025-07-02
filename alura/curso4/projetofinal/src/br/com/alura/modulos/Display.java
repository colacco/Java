package br.com.alura.modulos;


import java.util.Scanner;

public class Display {
    private static final Scanner scanner = new Scanner(System.in);

    public static int opcao(){
        System.out.println("Selecione a abaixo uma opção: ");
        System.out.println("1. Consulta por CEP.");
        System.out.println("2. Consulta por endereço.");
        System.out.println("3. Sair.");
        System.out.print("Opção: ");
        return scanner.nextInt();
    }
}
