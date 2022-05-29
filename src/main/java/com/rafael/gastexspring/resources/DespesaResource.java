package com.rafael.gastexspring.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rafael.gastexspring.entities.Despesa;
import com.rafael.gastexspring.services.DespesaService;

@RestController
@RequestMapping(value = "/Despesas")
public class DespesaResource {

	@Autowired
	private DespesaService despesaService;
	
	@GetMapping
	public ResponseEntity<List<Despesa>> findAll(){
		
		List<Despesa> list = despesaService.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@PostMapping
	public ResponseEntity<Despesa> insert(@RequestBody Despesa obj){
		obj = despesaService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		despesaService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
