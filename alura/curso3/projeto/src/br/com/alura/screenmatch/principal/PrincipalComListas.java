package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo; // objeto só é criado com new. Isso é uma variável de referência.

        List<Titulo> lista = new LinkedList<>(); // Shift + F6 refatora
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        // lista.forEach(item -> System.out.println(item));
        // lista.forEach(System.out::println);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){ // Java 17 acima
                System.out.println("Classificação " + filme.getClassificacao() );
            }
        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Paulo");
        buscarPorArtista.add("Jacqueline");
        System.out.println(buscarPorArtista);
        Collections.sort(buscarPorArtista);
        System.out.println("Lista ordenada: " + buscarPorArtista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano: " + lista);
    }
}
