/*
    Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
    Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
    Adicione um metodo específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
*/

package ex3;

public class Main {
    public static void main(String args[]){
        ContaCorrente id01 = new ContaCorrente();

        id01.depositar(10000);
        System.out.println("Saldo atual: " + id01.consultarSaldo());
        System.out.println();

        System.out.println("E se eu sacar 70.000?");
        id01.sacar(70000);
        System.out.println();

        id01.sacar(700);
        System.out.println("Sacando 700 agora temos um saldo de: " + id01.consultarSaldo());
        System.out.println();

        id01.setSaldoCorrente(10000);
        id01.cobrarTarifaMensal();
        System.out.println("Na conta corrente você possui: " + id01.getSaldoCorrente());
    }

}
