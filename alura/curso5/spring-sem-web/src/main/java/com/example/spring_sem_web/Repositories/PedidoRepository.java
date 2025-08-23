package com.example.spring_sem_web.Repositories;

import com.example.spring_sem_web.Models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {}