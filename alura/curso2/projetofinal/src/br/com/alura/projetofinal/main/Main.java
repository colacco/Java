package br.com.alura.projetofinal.main;
/*
Criar uma aplicação de músicas
- Classe principal - Aúdio
	Deixar privado os atributos
	- Titulo
	- Duração
	- Total de Reproduções
	- Curtidas
	- Classificação
	- Curtir()
	- Reproduzir()
- Criar heranças aplicando o encapsulamento -> br.com.alura.projetofinal.modelos.Podcast, Música
*/


import br.com.alura.projetofinal.modelos.Favoritos;
import br.com.alura.projetofinal.modelos.Musica;
import br.com.alura.projetofinal.modelos.Podcast;

public class Main {
    public static void main(String args[]){
        Musica minhamusica = new Musica();
        Podcast podcast = new Podcast();
        Favoritos favoritos = new Favoritos();

        minhamusica.setTitulo("Bohemian Rhapsody");
        minhamusica.setArtista("Queen");
        podcast.setTitulo("Introdução ao Java");
        podcast.setCriador("João Noites");

        for (int i = 0; i < 10000; i++){
            minhamusica.reproduzir();
        }

        for (int i = 0; i < 150; i++){
            minhamusica.curtir();
        }

        for (int i = 0; i < 100; i++){
            podcast.curtir();
        }

        for (int i = 0; i < 10000; i++){
            podcast.reproduzir();
        }

        System.out.println(minhamusica.getTotalReproducoes());
        System.out.println(minhamusica.getCurtidas());
        System.out.println(podcast.getTotalReproducoes());
        System.out.println(podcast.getCurtidas());

        favoritos.inclui(minhamusica);
        favoritos.inclui(podcast);

    }
}
