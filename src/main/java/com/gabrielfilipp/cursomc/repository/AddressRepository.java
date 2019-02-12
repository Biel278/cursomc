package com.gabrielfilipp.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielfilipp.cursomc.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	
}
