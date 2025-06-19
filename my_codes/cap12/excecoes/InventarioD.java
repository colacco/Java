import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;

class InventarioD{
    public static void main(String args[]){
        final double precoCaixa = 3.25;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        out.print("Quantas caixas temos? ");
        String numCaixasIn = keyboard.next();

        try {
            int numCaixas = Integer.parseInt(numCaixasIn);

            if (numCaixas < 0){
                throw new ExcecaoForaDoPadrao();
            }

            if (numCaixas > 1000){
                throw new ExcecaoNumeroMuitoGrande();
            }

            out.print("O valor é ");
            out.println(currency.format(numCaixas * precoCaixa));
        } catch (NumberFormatException e){
            out.println("Isto não é um número.");
            e.printStackTrace();
        } catch (ExcecaoForaDoPadrao e) {
            out.print(numCaixasIn);
            out.println("? Isto é impossível!");
        } catch (Exception e){
            out.println("Algo deu errado, mas não tenho ideia do que seja.");
        }

        out.println("Isso é só.");
    }
}
