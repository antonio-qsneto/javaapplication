package com.antonio.mc.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antonio.mc.domain.Cliente;
import com.antonio.mc.repositories.ClienteRepository;
import com.antonio.mc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService<X> {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));

		
		
	}

}
