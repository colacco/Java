import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

class JogoDeAdivinhacao {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        out.print("Entre com um inteiro de 1 a 10: ");
        
        int numeroEntrada = teclado.nextInt();
        int numeroAleatorio = new Random().nextInt(10) + 1;

        if (numeroEntrada == numeroAleatorio) {
            out.println("**************");
            out.println("*Você venceu.*");
            out.println("**************");            
        } else {
            out.println("Você perdeu.");
            out.println("O número aleatório era ");
            out.println(numeroAleatorio + ".");
        }
            
        out.println("Obrigado por jogar.");
    }
}