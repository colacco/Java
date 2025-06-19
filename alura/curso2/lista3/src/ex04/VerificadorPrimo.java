package ex04;

public class VerificadorPrimo extends NumerosPrimos {
    public void verificarSeEhPrimo(int valor){
        if (verificarPrimalidade(valor)){
            System.out.println("O valor é primo");
        } else {
            System.out.println("O valor não é primo");
        }
    }

}
