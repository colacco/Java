import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;

public class LoopDoInventario {
    public static void main(String args[]){
        final double precoCaixa = 3.25;
        boolean entradaCorreta = false;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        do {
            out.print("Quantas caixas temos? ");
            String numCaixasIn = keyboard.next();

            try {
                int numCaixas = Integer.parseInt(numCaixasIn);
                out.print("O valor é");
                out.println(currency.format(numCaixas * precoCaixa));
                entradaCorreta = true;
            } catch (NumberFormatException e) { // Isso ou aquilo?
                out.print(numCaixasIn);
                out.println("? Isto é impossível!");
            }
        } while (!entradaCorreta);

        out.println("Isso é só.");
    }
}
