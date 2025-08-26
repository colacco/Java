package com.example.screen_sound;

import com.example.screen_sound.Principal.Principal;
import com.example.screen_sound.Repositories.ArtistasRepository;
import com.example.screen_sound.Repositories.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenSoundApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenSoundApplication.class, args);
	}

    @Autowired
    ArtistasRepository artistasRepository;

    @Autowired
    MusicaRepository musicaRepository;

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(artistasRepository, musicaRepository);
        principal.exibirMenu();
    }
}
