package com.example.spring_sem_web.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Fornecedor(){}

    public Fornecedor(String nome){
        this.nome = nome;
    }
}
