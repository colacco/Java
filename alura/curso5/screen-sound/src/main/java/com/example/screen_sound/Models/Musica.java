package com.example.screen_sound.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "artista_musica", joinColumns = @JoinColumn(name = "musica_id"), inverseJoinColumns = @JoinColumn(name = "artista_id"))
    private List<Artista> artistas;

    public Musica(){}

    public Musica(String nome, List<Artista> artistas){
        this.nome = nome;
        this.artistas = artistas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return "Musica:" +
                "\n id = " + id +
                "\n nome = " + nome +
                "\n artistas = " + artistas.getFirst().getNome();
    }
}
