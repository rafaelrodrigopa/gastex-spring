package com.rafael.gastexspring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.gastexspring.entities.Receita;
import com.rafael.gastexspring.services.ReceitaService;

@RestController
@RequestMapping(value = "/Receitas")
public class ReceitaResource {
	
	@Autowired
	private ReceitaService receitaService;
	
	@GetMapping
	public ResponseEntity<List<Receita>> findAll(){
		
		List<Receita> list = receitaService.findAll();
		return ResponseEntity.ok().body(list);
	}

}
