class AcompanharPopulacao4 {
        public static void main(String args[]){
            Cidade montLobSP = new Cidade();
            montLobSP.populacao = 4123;
            montLobSP = doNascimento(montLobSP); // Irá retornar um OBJETO!!!
            System.out.println(montLobSP.populacao);
        }    

        static Cidade doNascimento(Cidade aCidade){ // Recebo uma variável do tipo Cidade
            Cidade minhaCidade = new Cidade();
            minhaCidade.populacao = aCidade.populacao + 1;
            return minhaCidade; // Retorno uma variável também do tipo Cidade
        }
}
