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


    public Principal(CategoriaRepository categoriaRepository, ProdutoRepository produtoRepository, PedidoRepository pedidoRepository, FuncionarioRepository funcionarioRepository, ClienteRepository clienteRepository){
        this.categoriaRepository = categoriaRepository;
        this.pedidoRepository = pedidoRepository;
        this.produtoRepository = produtoRepository;
        this.clienteRepository = clienteRepository;
        this.funcionarioRepository = funcionarioRepository;
    }

    public void exibeMenu(){
        Set<Produto> produtos = Set.of(produtoRepository.getReferenceById(1L), produtoRepository.getReferenceById(1L), produtoRepository.getReferenceById(3L));
        Pedido pedido = new Pedido(LocalDate.now(), produtos);

        pedidoRepository.save(pedido);
    }
}
