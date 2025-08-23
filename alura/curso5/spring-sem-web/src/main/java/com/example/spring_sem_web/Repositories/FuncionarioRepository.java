package com.example.spring_sem_web.Repositories;

import com.example.spring_sem_web.Models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {}