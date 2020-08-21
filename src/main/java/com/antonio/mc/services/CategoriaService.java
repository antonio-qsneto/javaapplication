package com.antonio.mc.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antonio.mc.domain.Categoria;
import com.antonio.mc.repositories.CategoriaRepository;
import com.antonio.mc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService<X> {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));

		
		
	}

}
