package com.edu.unab.modelo.service;

import java.util.Optional;

import com.edu.unab.modelo.entity.Propietario;

public interface PropierarioService {
	
	public Iterable<Propietario>findAll();
	public Optional<Propietario>findById(Integer id);
	public Propietario save (Propietario c);
	public void deleteById(Integer id);

}
