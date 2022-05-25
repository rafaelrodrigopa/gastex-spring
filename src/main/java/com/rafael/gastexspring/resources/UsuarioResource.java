package com.rafael.gastexspring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.gastexspring.entities.Usuario;

@RestController
@RequestMapping(value = "/Usuarios")
public class UsuarioResource {

	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		
		Usuario u = new Usuario(1L, "Rafael", "rafael@gmail.com");
		return ResponseEntity.ok().body(u);
	}
}
