import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class BuscarVaga {
    public static void main(String args[]) throws IOException{
        Scanner keyboard = new Scanner(System.in);
        Scanner diskScanner = new Scanner(new File("ListaHospedes.txt"));
        int hospedes [] = new int[10];
        int numQuarto;

        for(numQuarto = 0; numQuarto < 10; numQuarto++){
            hospedes[numQuarto] = diskScanner.nextInt();
        }

        numQuarto = 0;
        while (numQuarto < 10 && hospedes[numQuarto] != 0) {
            numQuarto++;
        }

        if (numQuarto == 10) {
            out.println("Desculpe, não há vagas.");
        } else {
            out.print("Quantas pessoas para o quarto ");
            out.print(numQuarto);
            out.print("?");
            hospedes[numQuarto] = keyboard.nextInt();
            PrintStream listOut = new PrintStream("ListaHospedes.txt");
            for(numQuarto = 0; numQuarto < 10; numQuarto++){
                listOut.print(hospedes[numQuarto]);
                listOut.print(" ");
            }
        }
    }
}
