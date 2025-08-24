package com.example.spring_sem_web;

import com.example.spring_sem_web.Models.*;
import com.example.spring_sem_web.Repositories.*;

import java.time.LocalDate;
import java.util.Set;

public class Principal {
    private final CategoriaRepository categoriaRepository;
    private final PedidoRepository pedidoRepository;
    private final ProdutoRepository produtoRepository;
    private final ClienteRepository  clienteRepository;
    private final FuncionarioRepository funcionarioRepository;
    private final FornecedorRepository fornecedorRepository;


    public Principal(CategoriaRepository categoriaRepository, ProdutoRepository produtoRepository, PedidoRepository pedidoRepository, FuncionarioRepository funcionarioRepository, ClienteRepository clienteRepository, FornecedorRepository fornecedorRepository){
        this.categoriaRepository = categoriaRepository;
        this.pedidoRepository = pedidoRepository;
        this.produtoRepository = produtoRepository;
        this.clienteRepository = clienteRepository;
        this.funcionarioRepository = funcionarioRepository;
        this.fornecedorRepository = fornecedorRepository;
    }

    public void exibeMenu(){
        Produto produto = new Produto("Jaca", 8.75, categoriaRepository.getReferenceById(3L), fornecedorRepository.getReferenceById(3L));
        produtoRepository.save(produto);
    }
}