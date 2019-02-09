package com.gabrielfilipp.cursomc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielfilipp.cursomc.domain.Categorie;
import com.gabrielfilipp.cursomc.repository.CategorieRepository;

@Service
public class CategorieService {
	
	@Autowired
	private CategorieRepository repo;
	
	public Categorie find(Integer id) {
	Optional<Categorie> obj = repo.findById(id);
		 return obj.orElse(null);
	}
	
	public List<Categorie> findAll(){
		List<Categorie> obj = repo.findAll();
		return obj;
	}

}
