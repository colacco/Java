package com.example.spring_sem_web.Repositories;

import com.example.spring_sem_web.Models.Categoria;
import com.example.spring_sem_web.Models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNomeContainingIgnoreCase(String pesquisa);

    List<Produto> findByCategoria(Categoria categoria);

    List<Produto> findByPrecoLessThan(double limite);

    List<Produto> findByPrecoGreaterThan(double limite);

    List<Produto> findByNome(String nomeProduto);

    List<Produto> findByCategoriaOrderByPreco(Categoria categoria);

    List<Produto> findByCategoriaOrderByPrecoDesc(Categoria categoria);

    Long countByCategoria(Categoria categoria);

    Long countByPrecoGreaterThan(double minimo);

    List<Produto> findByNomeContainingIgnoreCaseOrPrecoLessThan(String termo, double limite);

    List<Produto> findTop3ByOrderByPrecoDesc();

    List<Produto> findTop5ByCategoriaOrderByPreco(Categoria categoria);
}