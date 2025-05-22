import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double numero;
    
        System.out.print("Digite um número: ");
        numero = leitor.nextDouble();

        if (numero > 0) {
            System.out.println("O valor é positivo.");
        } else if (numero == 0) {
            System.out.println("O número é zero.");
        } else {
            System.out.println("O valor é negativo.");
        }
    }
}
