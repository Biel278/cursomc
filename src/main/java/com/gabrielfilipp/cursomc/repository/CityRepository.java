package com.gabrielfilipp.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielfilipp.cursomc.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
}
