package com.rafael.gastexspring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.gastexspring.entities.Categoria;
import com.rafael.gastexspring.services.CategoriaService;

@RestController
@RequestMapping(value = "/Categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		
		List<Categoria> list = categoriaService.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
}
