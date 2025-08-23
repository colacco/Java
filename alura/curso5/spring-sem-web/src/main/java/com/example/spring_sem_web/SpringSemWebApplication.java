package com.example.spring_sem_web;

import com.example.spring_sem_web.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSemWebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSemWebApplication.class, args);
	}

    @Autowired
    public CategoriaRepository categoriaRepository;

    @Autowired
    public PedidoRepository pedidoRepository;

    @Autowired
    public ProdutoRepository produtoRepository;

    @Autowired
    public ClienteRepository clienteRepository;

    @Autowired
    public FuncionarioRepository funcionarioRepository;

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(categoriaRepository, produtoRepository, pedidoRepository, funcionarioRepository, clienteRepository);
        principal.exibeMenu();
    }
}
