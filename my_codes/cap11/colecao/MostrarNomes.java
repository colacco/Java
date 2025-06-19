import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MostrarNomes {
    public static void main(String args[]) throws IOException{
        ArrayList<String> pessoas = new ArrayList<String>();
        Scanner diskScanner = new Scanner(new File("nomes.txt"));

        while(diskScanner.hasNext()){
            pessoas.add(diskScanner.nextLine());
        }

        pessoas.remove(0);
        pessoas.add(2, "Jim Newton");

        for(String nome : pessoas){
            out.println(nome);
        }
    }
    
}
