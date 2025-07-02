package br.com.alura.modelos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.out;

public class Display {
    public static void total(ArrayList<Conta> lista){
        Collections.sort(lista);
        out.println("*********************");
        out.println("COMPRAS REALIZADAS");
        out.println();
        for(Conta conta : lista){
            out.println(conta);
        }
        out.println();
        out.println("*********************");
        out.println();
        out.println("Saldo do cartão: " + Conta.getLimite());
    }

    public static boolean confirmacaoDeCompra(Scanner scanner){
        System.out.println("Compra realizada!");

        System.out.println("Digite 0 para sair ou 1 para continuar: ");
        return scanner.nextInt() == 1;
    }
}
