package ex3;

public class ContaBancaria {
    private double saldo;

    public double consultarSaldo(){
        return saldo;
    }

    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
        }
    }

    public void depositar(double valor){
        if (valor < 0){
            System.out.println("Esse valor não é permitido.");
        } else {
            saldo += valor;
        }
    }
}
