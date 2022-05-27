package com.rafael.gastexspring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rafael.gastexspring.entities.Categoria;
import com.rafael.gastexspring.entities.Despesa;
import com.rafael.gastexspring.entities.Receita;
import com.rafael.gastexspring.entities.Usuario;
import com.rafael.gastexspring.repositories.CategoriaRepository;
import com.rafael.gastexspring.repositories.DespesaRepository;
import com.rafael.gastexspring.repositories.ReceitaRepository;
import com.rafael.gastexspring.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private DespesaRepository despesaRepository;
	
	@Autowired
	private ReceitaRepository receitaRepository;

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "Rafael", "rafael@gmail.com");
		Usuario u2 = new Usuario(null, "Maria", "maria@gmail.com");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
		
		Categoria c1 = new Categoria(null, "Alimentos");
		Categoria c2 = new Categoria(null, "Pagamentos");
		Categoria c3 = new Categoria(null, "Higiene");
		Categoria c4 = new Categoria(null, "Banho");
		
		categoriaRepository.saveAll(Arrays.asList(c1,c2,c3,c4));
		
		// Padrão para data ISO 8601 "2022-05-11T13:23:07Z"
		Despesa d1 = new Despesa(null, "Arroz", 18.49, Instant.parse("2022-05-11T13:23:07Z"), c1, u1);
		Despesa d2 = new Despesa(null, "Leite", 5.49, Instant.parse("2022-05-11T19:53:07Z"), c1, u1);
		Despesa d3 = new Despesa(null, "Café", 8.49, Instant.parse("2022-05-12T17:13:02Z"), c1, u1);
		Despesa d4 = new Despesa(null, "Feijão", 6.49, Instant.parse("2022-05-13T19:53:07Z"), c1,u1);
		
		Despesa d5 = new Despesa(null, "Leite", 5.49, Instant.parse("2022-05-11T19:53:07Z"), c1, u2);
		Despesa d6 = new Despesa(null, "Café", 8.49, Instant.parse("2022-05-12T17:13:02Z"), c1, u2);
		
		despesaRepository.saveAll(Arrays.asList(d1,d2,d3,d4,d5,d6));
		
		Receita r1 = new Receita(null, "Pagamento", 900.00, Instant.parse("2022-05-05T19:53:07Z"), c2, u1);
		Receita r2 = new Receita(null, "Adiantamento", 950.00, Instant.parse("2022-05-20T19:53:07Z"), c2, u1);
		Receita r3 = new Receita(null, "Rig", 900.00, Instant.parse("2022-05-01T19:53:07Z"), c2, u1);
		Receita r4 = new Receita(null, "Trade", 900.00, Instant.parse("2022-05-15T19:53:07Z"), c2, u1);
		
		Receita r5 = new Receita(null, "Pagamento", 900.00, Instant.parse("2022-05-05T19:53:07Z"), c2, u2);
		Receita r6 = new Receita(null, "Adiantamento", 950.00, Instant.parse("2022-05-20T19:53:07Z"), c2, u2);
		
		receitaRepository.saveAll(Arrays.asList(r1,r2,r3,r4,r5,r5,r6));

				
	}
	
}
