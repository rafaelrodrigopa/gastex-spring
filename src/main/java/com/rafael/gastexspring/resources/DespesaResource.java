package com.rafael.gastexspring.resources;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.gastexspring.entities.Categoria;
import com.rafael.gastexspring.entities.Despesa;
import com.rafael.gastexspring.entities.Usuario;

@RestController
@RequestMapping(value = "/Despesas")
public class DespesaResource {

	@GetMapping
	public ResponseEntity<Despesa> findAll(){
		
		Despesa d = new Despesa(1L, "Arroz", 18.00, new Date(), new Categoria(1L, "Alimentos"), new Usuario(1L, "Rafael", "rafael@gmail.com"));
		return ResponseEntity.ok().body(d);
		
	}
}
