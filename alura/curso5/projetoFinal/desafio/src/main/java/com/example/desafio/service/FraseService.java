package com.example.desafio.service;

import com.example.desafio.dto.FraseDTO;
import com.example.desafio.model.Frase;
import com.example.desafio.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO getPhrase() {
        long min = 1L;
        long max = repository.count();
        long randomNumberInRange = (int) (Math.random() * (max - min)) + min;

        Optional<Frase> frase = repository.findById(randomNumberInRange);

        if (frase.isEmpty()){
            return converteParaDTO(repository.findById(1L).get());
        } else {
            return converteParaDTO(frase.get());
        }
    }

    private FraseDTO converteParaDTO(Frase frase){
        return new FraseDTO(frase.getId(), frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
