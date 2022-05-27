package com.rafael.gastexspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.gastexspring.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
 
}
