import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;

class InventarioB{
    public static void main(String args[]){
        final double precoCaixa = 3.25;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        out.print("Quantas caixas temos? ");
        String numCaixasIn = keyboard.next();

        try {
            int numCaixas = Integer.parseInt(numCaixasIn);
            out.print("O valor é ");
            out.println(currency.format(numCaixas * precoCaixa));
        } catch (NumberFormatException e){
            out.println("Isto não é um número.");
            out.println("Mensagem: ***" + e.getMessage() + "***");
            e.printStackTrace();
        }
    }
}