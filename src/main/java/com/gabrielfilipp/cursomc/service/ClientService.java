package com.gabrielfilipp.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielfilipp.cursomc.domain.Client;
import com.gabrielfilipp.cursomc.exceptions.ObjectNotFoundException;
import com.gabrielfilipp.cursomc.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	public Client find(Integer id) {
		Optional<Client> obj = repository.findById(id);
		return obj.orElseThrow(
				() -> new ObjectNotFoundException("Object not found! id: " + id + ", Type: " + Client.class.getName()));
	}

}
