package com.rafael.gastexspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.gastexspring.entities.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {
 
}
