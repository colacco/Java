public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;
    
    void fichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("\nAvaliação: " + avaliacao);
        System.out.println("Número de avaliações: " + numAvaliacoes);
    }

    void avalia(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double media(){
        return avaliacao / numAvaliacoes;
    }
}
