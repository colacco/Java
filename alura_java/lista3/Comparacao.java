import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1, n2;

        System.out.print("Escreva um número: ");
        n1 = leitor.nextDouble();
        System.out.print("Escreva outro número: ");
        n2 = leitor.nextDouble();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior.");
        } else if (n1 == n2) {
            System.out.println("Os valores são os mesmos.");
        } else {
            System.out.println("O primeiro número é menor.");
        }

    }    
}
