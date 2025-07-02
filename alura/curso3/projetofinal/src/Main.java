import br.com.alura.modelos.Conta;
import br.com.alura.modelos.Display;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        ArrayList<Conta> listaConta = new ArrayList<>();

        Conta.setLimite(teclado);
        do{
            Conta conta = new Conta(teclado);
            if(conta.getValor() == 0){
                break;
            }
            listaConta.add(conta);
        } while (Display.confirmacaoDeCompra(teclado));

        Display.total(listaConta);
    }
}
