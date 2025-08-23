package com.example.spring_sem_web.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @Column(name = "Data de Nascimento")
    private LocalDate dataNasc;

    private String setor;

    public Funcionario(String nome, LocalDate dataNasc, String setor) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.setor = setor;
    }
}
