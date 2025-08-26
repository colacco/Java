package com.example.screen_sound.Principal;

import com.example.screen_sound.Models.Artista;
import com.example.screen_sound.Models.Categoria;
import com.example.screen_sound.Models.Musica;
import com.example.screen_sound.Repositories.ArtistasRepository;
import com.example.screen_sound.Repositories.MusicaRepository;
import com.example.screen_sound.Service.ConsultaGemini;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private final Scanner leitor = new Scanner(System.in);
    private final ArtistasRepository artistasRepository;
    private final MusicaRepository musicaRepository;

    public Principal(ArtistasRepository artistasRepository, MusicaRepository musicaRepository){
        this.artistasRepository = artistasRepository;
        this.musicaRepository = musicaRepository;
    }

    public void exibirMenu(){
        int opcao = -1;
        while (opcao != 9) {
            System.out.print("""
                    *** Screen Sound Músicas ***
                   \s
                    1 - Cadastrar artistas
                    2 - Cadastrar músicas
                    3 - Listar artistas
                    4 - Listar músicas
                    5 - Buscar músicas por artistas
                    6 - Pesquisar dados sobre um artista (Gemini)
                   \s
                    9 - Sair
                   \s
                    Digite a opção desejada:\s""");
            opcao = Integer.parseInt(leitor.nextLine());

            switch (opcao) {
                case 1:
                    cadastroArtista();
                    break;
                case 2:
                    cadastroMusica();
                    break;
                case 3:
                    listarArtista();
                    break;
                case 4:
                    listarMusica();
                    break;
                case 5:
                    filtroArtista();
                    break;
                case  6:
                    dadosArtista();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    private void cadastroArtista(){
        String cadastrarNovo = "S";

        while(cadastrarNovo.equalsIgnoreCase("s")) {
            System.out.print("Insira o nome do artista: ");
            String nome = leitor.nextLine();

            System.out.print("Selecione o tipo (Solo, dupla, grupo ou banda): ");
            String tipo = leitor.nextLine();
            Categoria categoria = Categoria.valueOf(tipo.toUpperCase());

            Artista artista = new Artista(nome, categoria);
            artistasRepository.save(artista);

            System.out.println("Cadastrar novo artista? (S/N)");
            cadastrarNovo = leitor.nextLine();
        }
    }

    private void cadastroMusica(){
        String nomeArtista;

            System.out.print("Insira o nome do artista: ");
            nomeArtista = leitor.nextLine();

            Optional<Artista> artista = artistasRepository.findByNomeContainingIgnoreCase(nomeArtista);
            if (artista.isPresent()){
                System.out.print("Insira o título da música: ");
                String tiulo = leitor.nextLine();

                Musica musica = new Musica(tiulo, List.of(artista.get()));
                musicaRepository.save(musica);
                System.out.println("Dados inseridos!");
            } else {
                System.out.println("Artista não encontrado.");
            }
    }

    private void listarArtista(){
        artistasRepository.findAll().forEach(System.out::println);
    }

    private void listarMusica(){
        musicaRepository.findAll().forEach(System.out::println);
    }

    private void filtroArtista(){
        artistasRepository.findAll().forEach(System.out::println);
        System.out.println("Insira o artista desejado: ");
        String nomeArtista = leitor.nextLine();

        List<Musica> musicas = musicaRepository.filtroArtista(nomeArtista);
        musicas.forEach(System.out::println);
    }

    private void dadosArtista(){
        System.out.print("Insira o artista que quer conhecer: ");
        String artista = leitor.nextLine();
        System.out.println(ConsultaGemini.obterTraducao(artista));
    }
}
