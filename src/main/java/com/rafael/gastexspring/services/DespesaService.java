package com.rafael.gastexspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.gastexspring.entities.Despesa;
import com.rafael.gastexspring.repositories.DespesaRepository;

@Service
public class DespesaService {

	@Autowired
	private DespesaRepository repository;
	
	public List<Despesa> findAll(){
		return repository.findAll();
	}
	
	public Despesa findById(Long id) {
		Optional<Despesa> obj = repository.findById(id);
		return obj.get();
	}
	
	public Despesa insert(Despesa obj) {
		return repository.save(obj);
	}
	
}
