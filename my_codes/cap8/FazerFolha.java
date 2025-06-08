import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class FazerFolha {
    public static void main(String[] args) throws IOException {
        Scanner diskScanner = new Scanner(new File("EmpregadosInfo.txt"));
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
