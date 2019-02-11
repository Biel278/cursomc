package com.gabrielfilipp.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gabrielfilipp.cursomc.domain.Categorie;
import com.gabrielfilipp.cursomc.repository.CategorieRepository;
import com.gabrielfilipp.cursomc.resources.CategorieResource;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}
	
	@Autowired
	private CategorieRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		Categorie cat1 = new Categorie(null,"Informática");
		Categorie cat2 = new Categorie(null,"Escritório");
		
		repository.saveAll(Arrays.asList(cat1,cat2));
		
	}

}

