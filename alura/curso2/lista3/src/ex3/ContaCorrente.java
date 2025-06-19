package ex3;

public class ContaCorrente extends ContaBancaria{
    private double saldoCorrente;

    public void setSaldoCorrente(double saldoCorrente) {
        this.saldoCorrente = saldoCorrente;
    }

    public double getSaldoCorrente() {
        return saldoCorrente;
    }

    public void cobrarTarifaMensal(){
        saldoCorrente *= (1 - 0.01);
    }
}
