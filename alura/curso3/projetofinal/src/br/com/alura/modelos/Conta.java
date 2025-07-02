package br.com.alura.modelos;

import java.util.Scanner;

public class Conta implements Comparable<Conta> {
    private static double limite;
    private double valor;
    private String item;

    public Conta(Scanner scanner){
        System.out.println("Digite o item que deseja comprar: ");
        this.item = scanner.next();

        System.out.println("Digite o valor da compra: ");
        this.valor = verificarValor(scanner.nextDouble());
    }

    public static void setLimite(Scanner scanner) {
        System.out.println("Digite o limite do cartão: ");
        Conta.limite = scanner.nextDouble();
    }


    public static double getLimite() {
        return limite;
    }

    public double getValor() {
        return valor;
    }

    public double verificarValor(double valor){
        if(valor > Conta.limite){
            System.out.println("Saldo insuficiente!");
            return 0;
        } else {
            Conta.limite -= valor;
            return valor;
        }
    }

    @Override
    public String toString() {
        return item + " - R$" + valor;
    }

    @Override
    public int compareTo(Conta conta) {
        return Double.compare(this.valor, conta.valor);
    }
}
