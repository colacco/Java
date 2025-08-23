package com.example.spring_sem_web.Repositories;

import com.example.spring_sem_web.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}