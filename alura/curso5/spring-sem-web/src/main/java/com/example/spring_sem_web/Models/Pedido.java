package com.example.spring_sem_web.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "produto_pedido",  joinColumns = @JoinColumn(name = "pedido_id"), inverseJoinColumns =  @JoinColumn(name = "produto_id"))
    private Set<Produto> produtos = new HashSet<>();

    private LocalDate date;

    public Pedido() {}

    public Pedido(LocalDate date, Set<Produto> produtos) {
        this.date = date;
        this.produtos = produtos;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Pedido: " +
                "\ndate = " + date +
                ",\nid = " + id;
    }
}
