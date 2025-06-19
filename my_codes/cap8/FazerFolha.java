import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class FazerFolha {
    public static void main(String[] args) throws IOException { // Para mostrar ao compilador que está ciente das consequências.
        Scanner diskScanner = new Scanner(new File("dataFiles/EmpregadosInfo.txt")); // ou pegar o caminho pelo pwd e colocar dentro do new File()
        for (int empNum = 1; empNum <= 3; empNum++){
            pagarUmEmpregado(diskScanner);
        }
    }

    static void pagarUmEmpregado(Scanner aScanner){
        Empregado umEmpregado = new Empregado();

        umEmpregado.setNome(aScanner.nextLine());
        umEmpregado.setCargo(aScanner.nextLine());
        umEmpregado.preencherCheque(aScanner.nextDouble());
        aScanner.nextLine();
    }
}


