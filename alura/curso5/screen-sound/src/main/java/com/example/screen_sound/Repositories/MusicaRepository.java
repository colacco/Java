package com.example.screen_sound.Repositories;

import com.example.screen_sound.Models.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
    @Query("SELECT m FROM Musica m JOIN m.artistas a WHERE a.nome = :nome")
    List<Musica> filtroArtista(String nome);
}
