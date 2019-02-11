package com.gabrielfilipp.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gabrielfilipp.cursomc.domain.Categorie;
import com.gabrielfilipp.cursomc.domain.City;
import com.gabrielfilipp.cursomc.domain.Product;
import com.gabrielfilipp.cursomc.domain.State;
import com.gabrielfilipp.cursomc.repository.CategorieRepository;
import com.gabrielfilipp.cursomc.repository.CityRepository;
import com.gabrielfilipp.cursomc.repository.ProductRepository;
import com.gabrielfilipp.cursomc.repository.StateRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Autowired
	private CategorieRepository repositoryCat;

	@Autowired
	private ProductRepository repositoryPro;
	
	@Autowired
	private StateRepository repositorySta;

	@Autowired 
	private CityRepository repositoryC;
	
	@Override
	public void run(String... args) throws Exception {
		Categorie cat1 = new Categorie(null, "Informática");
		Categorie cat2 = new Categorie(null, "Escritório");

		Product p1 = new Product(null, "Computador", 2000.00);
		Product p2 = new Product(null, "Impressora", 800.00);
		Product p3 = new Product(null, "Mouse", 80.00);

		/*
		 * instanciando a tabela de relacionamento many to many e colocando valores nas
		 * listas
		 */
		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProducts().addAll(Arrays.asList(p2));

		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));

		repositoryCat.saveAll(Arrays.asList(cat1, cat2));
		repositoryPro.saveAll(Arrays.asList(p1, p2, p3));

		State sta1 = new State(null, "Minas Gerais");
		State sta2 = new State(null, "São Paulo");

		City c1 = new City(null, "Uberlândia", sta1);
		City c2 = new City(null, "São Paulo", sta2);
		City c3 = new City(null, "Campinas", sta2);

		sta1.getCities().addAll(Arrays.asList(c1));
		sta2.getCities().addAll(Arrays.asList(c2, c3));
		
		repositorySta.saveAll(Arrays.asList(sta1,sta2));
		repositoryC.saveAll(Arrays.asList(c1,c2,c3));

	}

}
