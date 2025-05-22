import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;

public class DeletarProva {
    public static void main(String[] args){
        File prova = new File("livrosAdulterados.txt");
        Scanner keyboard = new Scanner(System.in);
        char reply;

        do {
            out.print("Deletar prova? (s/n) ");
            reply = keyboard.findWithinHorizon(".", 0).charAt(0);
        } while (reply != 's' && reply != 'n' && reply != 'S' && reply != 'N');

        if (reply == 's'|| reply == 'S') {
            out.println("Ok, lá vai...");
            prova.delete();
            out.println("O arquivo foi deletado.");
        } else {
            out.println("Tudo bem.");
        }
    }
}
