package com.example.spring_sem_web.Repositories;

import com.example.spring_sem_web.Models.Categoria;
import com.example.spring_sem_web.Models.Produto;
import org.hibernate.boot.model.source.internal.hbm.PluralAttributeKeySourceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

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

    // DESAFIO JPQL:

    @Query("SELECT p FROM Produto p WHERE p.preco > :preco")
    List<Produto> produtosAcimaDe(double preco);

    @Query("SELECT p FROM Produto p ORDER BY p.preco")
    List<Produto> produtosOrdenadoPreco();

    @Query("SELECT p FROM Produto p ORDER BY p.preco DESC")
    List<Produto> produtosOrdenadoPrecoDesc();

    @Query("SELECT p FROM Produto p WHERE p.nome ILIKE :letra%")
    List<Produto> buscaPrimeiraLetra(String letra);

    @Query("SELECT AVG(p.preco) FROM Produto p")
    double mediaProduto();

    @Query("SELECT MAX(p.preco) FROM Produto p WHERE categoria = :categoria")
    double maximoPorCategoria(Categoria categoria);

    @Query("SELECT COUNT(*) FROM Produto p WHERE categoria = :categoria")
    Integer quantidadePorCategoria(Categoria categoria);

    @Query("SELECT p FROM Produto p WHERE p.nome = :nome OR p.categoria = :categoria")
    List<Produto> produtoPorNomeOuCategoria(String nome, Categoria categoria);

    @Query(value = "SELECT * FROM PRODUTO ORDER BY VALOR DESC LIMIT 5" , nativeQuery = true)
    List<Produto> top5ProdutosNativo();
}