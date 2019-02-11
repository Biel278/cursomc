package com.gabrielfilipp.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielfilipp.cursomc.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
	
}
