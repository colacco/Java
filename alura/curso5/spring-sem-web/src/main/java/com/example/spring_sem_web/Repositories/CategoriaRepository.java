package com.example.spring_sem_web.Repositories;

import com.example.spring_sem_web.Models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}