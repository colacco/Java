package com.example.spring_sem_web.Repositories;

import com.example.spring_sem_web.Models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}