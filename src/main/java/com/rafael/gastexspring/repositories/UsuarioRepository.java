package com.rafael.gastexspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.gastexspring.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
 
}
