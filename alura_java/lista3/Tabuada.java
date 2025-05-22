import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double numero;
        double valor;

        System.out.print("Insira um valor: ");
        numero = input.nextDouble();

        for (int i = 0; i <= 10; i++){
            valor = numero * i;
            System.out.println(numero + " X " + i + " = " + valor);
        }
    }
}
