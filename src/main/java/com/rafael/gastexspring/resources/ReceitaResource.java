package com.rafael.gastexspring.resources;

import java.util.Date;

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
		
		Receita r = new Receita(1, "Vale", 900.00, new Date(), new Categoria(1, "Pagamentos"), new Usuario(1, "Rafael", "rafael@gmail.com"));
		return ResponseEntity.ok().body(r);
	}

}
