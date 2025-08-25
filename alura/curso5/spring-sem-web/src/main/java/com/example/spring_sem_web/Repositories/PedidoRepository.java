package com.example.spring_sem_web.Repositories;

import com.example.spring_sem_web.Models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByDateIsNull();

    List<Pedido> findByDateIsNotNull();

    List<Pedido> findByDateGreaterThan(LocalDate data);

    List<Pedido> findByDateLessThan(LocalDate data);

    List<Pedido> findByDateGreaterThanAndDateLessThan(LocalDate dataInicio, LocalDate dataFinal);

    // DESAFIO JPQL

    @Query("SELECT p FROM Pedido p WHERE p.date > :dateInicio AND p.date < :dateFinal")
    List<Pedido> consultaEntre(LocalDate dateInicio, LocalDate dateFinal);
}