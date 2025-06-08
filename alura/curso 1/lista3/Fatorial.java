import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int total = 1;
        int valor;

        System.out.print("Insira um valor: ");
        valor = leitor.nextInt();

        while (valor != 1){
            total *= valor;
            valor--;
        }

        System.out.println("O fatorial de " + valor + " é " + total);
    }
}
