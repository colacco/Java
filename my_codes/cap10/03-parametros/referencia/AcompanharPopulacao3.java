class AcompanharPopulacao3 {
    public static void main(String args[]){
        Cidade montLobSP = new Cidade();
        montLobSP.populacao = 4123;
        nascimento(montLobSP); // Passando um objeto para o método nascimento().
        System.out.println(montLobSP.populacao);
    }    

    static void nascimento(Cidade aCidade){ // Recebe o tipo do OBJETO que você quer alterar o valor.
        aCidade.populacao++;
    }
}
