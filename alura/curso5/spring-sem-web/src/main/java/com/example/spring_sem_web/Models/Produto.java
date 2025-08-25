package com.example.spring_sem_web.Models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nome;

    @Column(name = "valor")
    private double preco;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToMany(mappedBy = "produtos", fetch = FetchType.EAGER)
    private Set<Pedido> pedidos = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;

    public Produto() {}

    public Produto(String nome, double preco, Categoria categoria,Fornecedor fornecedor){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Produto: " +
                "\nid =" + id +
                ",\n nome = " + nome +
                ",\n preco = " + preco +
                ",\n categoria = " + categoria +
                ",\n fornecedor = " + fornecedor +
                '\n';
    }
}
