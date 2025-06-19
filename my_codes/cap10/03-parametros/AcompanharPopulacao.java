// Retornando um resultado

public class AcompanharPopulacao {
    public static void main(String args[]){
        int popMontLobSP = 4123;

        popMontLobSP = nascimento(popMontLobSP);
        System.out.println(popMontLobSP);
    }

    static int nascimento(int popCidade){
        return popCidade + 1;
    }
}
