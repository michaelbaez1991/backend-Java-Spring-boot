package com.backend.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600)
@RestController
@RequestMapping({"/globalTech"})
public class Controlador   {
		
	@Autowired
	globalEnTechService service;
	
	@GetMapping
	public List<globalEnTech>listar() {
		return service.listar();
	}
	
	@PostMapping
	public globalEnTech agregar(@RequestBody globalEnTech g) {
		return service.add(g);
	}
	
	@GetMapping(path = { "/{id}" })
	public globalEnTech listarId(@PathVariable("id")int id) {
		return service.listarId(id);
	}
	
	@PutMapping(path = { "/{id}" })
	public globalEnTech editar(@RequestBody globalEnTech g, @PathVariable("id")int id) {
		g.setId(id);
		return service.edit(g);
	}
}