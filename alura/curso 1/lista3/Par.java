import java.util.Scanner;

public class Par {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.print("Insira um valor: ");
        numero = leitor.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }
    }
}
