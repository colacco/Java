public class Carro {
    String modelo;
    String cor;
    int ano;
    
    int idade(int anoAtual){
        return anoAtual - ano;
    }

    void fichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}
