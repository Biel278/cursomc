package com.gabrielfilipp.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielfilipp.cursomc.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
	
}
