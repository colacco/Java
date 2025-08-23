package com.example.spring_sem_web.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String nome;

    @Column(name = "Data de nascimento")
    private LocalDate dataNasc;

    public Cliente(String nome, LocalDate dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }
}
