package com.rafael.gastexspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.gastexspring.entities.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
 
}
