package com.rafael.gastexspring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.gastexspring.entities.Categoria;

@RestController
@RequestMapping(value = "/Categorias")
public class CategoriaResource {

	@GetMapping
	public ResponseEntity<Categoria> findAll(){
		
		Categoria c = new Categoria(1L, "Alimentos");
		return ResponseEntity.ok().body(c);
		
	}
	
}
