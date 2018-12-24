package com.gabrielfilipp.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielfilipp.cursomc.domain.Categorie;

@RestController
@RequestMapping (value ="/categories")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categorie> listar() {
		
		Categorie cat1 = new Categorie(1,"Informática");
		Categorie cat2 = new Categorie(2,"Escritório");
		
		List<Categorie>lista = new ArrayList<>();
		
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
	
}
