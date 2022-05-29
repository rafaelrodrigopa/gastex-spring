package com.rafael.gastexspring.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String profissao;

	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<Receita> receitas = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<Despesa> despesas = new ArrayList<>();
	
	public Usuario() {
	}


	public Usuario(Long id, String nome, String profissao) {
		this.id = id;
		this.nome = nome;
		this.profissao = profissao;
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public List<Receita> getReceitas() {
		return receitas;
	}


	public List<Despesa> getDespesas() {
		return despesas;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	// Retorna o valor total de todas as receitas
	public Double getSaldo() {
		
		double total_rec = 0.0;
		
		for(Receita rec : receitas) {
			total_rec += rec.getValor();
		}
		
		return total_rec;
	}


	// Retorna o valor total de todas os débitos
	public Double getDebito() {
		
		double total_deb = 0.0;
		
		for(Despesa des : despesas) {
			total_deb += des.getValor();
		}
		
		return total_deb;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", profissao=" + profissao + "]";
	}
	
	
}
