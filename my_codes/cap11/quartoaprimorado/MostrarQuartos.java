import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class MostrarQuartos {
    public static void main(String args[]) throws IOException{
        Quarto quartos[]; 
        quartos = new Quarto[10];
        Scanner diskScanner = new Scanner(new File("ListaQuartos.txt"));

        for (int numQuarto = 0; numQuarto < 10; numQuarto++){
            quartos[numQuarto] = new Quarto();
            quartos[numQuarto].lerQuarto(diskScanner);
        }

        out.println("Quarto\tHóspedes\tTarifa\tFumante?");
        for (int numQuarto = 0; numQuarto < 10; numQuarto++){
            out.print(numQuarto);
            out.print("\t");
            quartos[numQuarto].escreverQuarto();
        }
    }    
}
