package com.rafael.gastexspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.gastexspring.entities.Receita;
import com.rafael.gastexspring.repositories.ReceitaRepository;

@Service
public class ReceitaService {

	@Autowired
	private ReceitaRepository repository;
	
	public List<Receita> findAll(){
		return repository.findAll();
	}
	
	public Receita findById(Long id) {
		Optional<Receita> obj = repository.findById(id);
		return obj.get();
	}
	
	public Receita insert(Receita obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Receita update(Long id, Receita obj) {
		@SuppressWarnings("deprecation")
		Receita entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Receita entity, Receita obj) {
		
		entity.setData(obj.getData());
		entity.setDescricao(obj.getDescricao());
		entity.setValor(obj.getValor());
		entity.setCategoria(obj.getCategoria());
		entity.setUsuario(obj.getUsuario());
	}
}
