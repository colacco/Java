import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        int numero = new Random().nextInt(100);
        Scanner leitor = new Scanner(System.in);
        int tentativas = 0;
        int chute = 255;

        while (chute != numero) {
            System.out.println("Digite um número");
            chute = leitor.nextInt();
            tentativas++;

            if (chute > numero){
                System.out.println("Esse número é maior!");
            } 
            if (chute < numero){
                System.out.println("Esse número é menor!");
            }
            if (chute == numero){
                System.out.println("Você acertou!");
                System.out.println("Foi concluido em " + tentativas + " tentativa(s).");
                break;
            }
        }
    }
    
}