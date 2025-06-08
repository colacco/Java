import static java.lang.System.out;
// O nome do arquivo deve ser correspondente ao que possui o método main();
// Além disso o arquivo com o método main() deve ser o único public.
// A posição das classes também não interfere no resultado final.

public class UsoDeconta {
    public static void main(String[] args){
        Conta minhaConta;
        Conta suaConta;

        minhaConta = new Conta();
        suaConta = new Conta();

        minhaConta.nome = "Barry Burd";
        minhaConta.endereco = "Rua Ciberespaço 222";
        minhaConta.saldo = 24.02;

        suaConta.nome = "João Q. Público";
        suaConta.endereco = "Rua Consumidor 111";
        suaConta.saldo = 55.63;

        minhaConta.display();
        
        out.print(" mais $");
        out.print(minhaConta.getJuros(5.00));
        out.println(" juros ");
        
        suaConta.display();

        double suaTaxaJuros = 7.0;
        out.print(" mais $");
        double seuValorJuros = suaConta.getJuros(suaTaxaJuros);
        out.print(seuValorJuros);
        out.println(" juros ");


    }
}

class Conta{
    String nome;
    String endereco;
    double saldo;

    public void display(){
        out.print(nome);
        out.print(" (");
        out.print(endereco);
        out.print(") tem $");
        out.print(saldo);
    }

    public double getJuros(double taxaPercentual){
        return saldo * taxaPercentual / 100.00;
    }
}

