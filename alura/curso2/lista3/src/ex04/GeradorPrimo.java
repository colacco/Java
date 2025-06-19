package ex04;

public class GeradorPrimo extends  NumerosPrimos {
    public int gerarProximoPrimo(int valor){
        while (true){
            valor++;
            if(verificarPrimalidade(valor)){
                return valor;
            }
        }
    }
}
