package com.gabrielfilipp.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielfilipp.cursomc.domain.Categorie;
import com.gabrielfilipp.cursomc.service.CategorieService;

@RestController
@RequestMapping (value ="/categories")
public class CategorieResource {
	
	@Autowired
	private CategorieService service;
	
	@RequestMapping( value="/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categorie obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<?> findAll(){
		Categorie obj =  (Categorie) service.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	
}
