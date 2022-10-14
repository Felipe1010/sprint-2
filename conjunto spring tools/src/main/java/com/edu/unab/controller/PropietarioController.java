package com.edu.unab.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.unab.modelo.entity.Propietario;
import com.edu.unab.modelo.service.PropierarioService;


@RestController
@RequestMapping("/api/propietario")
public class PropietarioController {
	
	@Autowired
	PropierarioService propierarioService;
	
	@PostMapping
	public Propietario guardar(@RequestBody Propietario propietario) {
		return propierarioService.save(propietario);
	}
	
	@GetMapping("/listar")
	public Iterable<Propietario> listartodos(){
		return propierarioService.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Propietario> buscarPorID(@PathVariable Integer id){
		return propierarioService.findById(id);
	}
	
	@DeleteMapping("{id}")
	public void  eliminar(@PathVariable Integer id){
		propierarioService.deleteById(id);
	}
	
	

	

}
