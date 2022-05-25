package com.rafael.gastexspring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rafael.gastexspring.entities.Usuario;
import com.rafael.gastexspring.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "Rafael", "rafael@gmail.com");
		Usuario u2 = new Usuario(null, "Maria", "maria@gmail.com");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
}
