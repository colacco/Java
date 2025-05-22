import static java.lang.System.out;
import java.util.Scanner;

public class UsandoSwitch {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        out.print("Qual verso? ");
        int verso = keyboard.nextInt();

        switch (verso) {
            // fall-through, acontece quando você esqeuce de adcionar "break;" ao final dos cases...
            // ... é realizado uma reação em cadeia de execução dos outros cases.
            // A partir do Java 7 começou a ser permitido a utilização de Strings no Switch.
            case 1:
                out.println("That's because he has no brain.");
                break;
            case 2:
                out.println("That's  because he is a pain");
                break;
            case 3:
                out.println("Cause this is the last refrain");
                break;
            default:
                out.println("Não há este verso. Por favor tente novamente.");
                break;
        }
        out.println("Ohhh......");
    }
}
