import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;

public class Quarto {
    private int hospedes;
    private double tarifa;
    private boolean fumante;
    private static NumberFormat currency =  NumberFormat.getCurrencyInstance();

    public void lerQuarto(Scanner diskScanner){
        hospedes = diskScanner.nextInt();
        tarifa = diskScanner.nextDouble();
        fumante = diskScanner.nextBoolean();
    }

    public void escreverQuarto(){
        out.print(hospedes);
        out.print("\t");
        out.print(currency.format(tarifa));
        out.print("\t");
        out.println(fumante ? "sim" : "não");
    }
}
