package com.edu.unab.modelo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.unab.modelo.entity.Propietario;
import com.edu.unab.repository.PropietarioRepository;

@Service
public class PropietarioServiceImpl implements PropierarioService {
	
	@Autowired
	private PropietarioRepository propietarioRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Propietario> findAll() {
		// TODO Auto-generated method stub
		return propietarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Propietario> findById(Integer id) {
		// TODO Auto-generated method stub
		return propietarioRepository.findById(id);
	}

	@Override
	@Transactional
	public Propietario save(Propietario c) {
		// TODO Auto-generated method stub
		return propietarioRepository.save(c);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		propietarioRepository.deleteById(id);
		
	}

}
