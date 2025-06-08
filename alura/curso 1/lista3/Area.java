import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        boolean loop = true;
        double ladoQuadrado, raioDoCirculo, area;

        System.out.println("Software de cálculo de área:");
        System.out.println("1. Área do quadrado");
        System.out.println("2. Área do círculo");

        while (loop){
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira o valor do lado do quadrado: ");
                    ladoQuadrado = leitor.nextDouble();
                    area = ladoQuadrado * ladoQuadrado;

                    System.out.println("A área total do quadrado é : " + area);
                    loop = false;
                    break;
                case 2:
                    System.out.print("Insira o valor do raio do círculo: ");
                    raioDoCirculo = leitor.nextDouble();
                    area = 3.14159265358979323846 * raioDoCirculo * raioDoCirculo;

                    System.out.println("A área total do círculo é: " + area);
                    loop = false;
                    break;
                default:
                    System.out.println("Essa opção não é válida, por favor, insira novamente.");
                    break;
            }
        }
    }    
}
