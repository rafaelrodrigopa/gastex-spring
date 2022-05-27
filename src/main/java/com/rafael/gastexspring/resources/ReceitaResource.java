package com.rafael.gastexspring.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.gastexspring.entities.Categoria;
import com.rafael.gastexspring.entities.Receita;
import com.rafael.gastexspring.entities.Usuario;

@RestController
@RequestMapping(value = "/Receitas")
public class ReceitaResource {
	
	@GetMapping
	public ResponseEntity<Receita> findAll(){
		
		Receita r = new Receita(1L, "Vale", 900.00, Instant.parse("2022-05-05T19:53:07Z"), new Categoria(1L, "Pagamentos"), new Usuario(1L, "Rafael", "rafael@gmail.com"));
		return ResponseEntity.ok().body(r);
	}

}
