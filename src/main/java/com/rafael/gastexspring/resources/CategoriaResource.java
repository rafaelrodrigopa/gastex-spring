package com.rafael.gastexspring.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping
	public ResponseEntity<Categoria> insert(@RequestBody Categoria obj){
		obj = categoriaService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		categoriaService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Categoria> update(@PathVariable Long id, @RequestBody Categoria obj){
		obj = categoriaService.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
	
}
