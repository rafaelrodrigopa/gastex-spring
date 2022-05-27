package com.rafael.gastexspring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
