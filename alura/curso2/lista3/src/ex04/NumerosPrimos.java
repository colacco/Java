package ex04;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int valor){
        if(valor <= 1){
            return false;
        }

        for (int i = 2; i*i <= valor; i++){
            if( valor % i == 0){
                return false;
            }
        }

        return true;
    }

    public void listarPrimos(int valor){
        System.out.println("Números primos até " + valor + ": ");
        for (int i = 2; i <= valor; i++){
            if (verificarPrimalidade(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}

