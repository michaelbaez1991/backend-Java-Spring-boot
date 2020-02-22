package com.backend.backend;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class globalEnTechServiceImp implements globalEnTechService{
	@Autowired
	private globalEnTechRepositorio repositorio;

	@Override
	public List<globalEnTech> listar() {
		return repositorio.findAll();
	}

	@Override
	public globalEnTech listarId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public globalEnTech add(globalEnTech g) {
		return repositorio.save(g);
	}

	@Override
	public globalEnTech edit(globalEnTech g) {
		return repositorio.save(g);
	}

	@Override
	public globalEnTech delete(int id) {
		globalEnTech g = repositorio.findById(id);
		if(g != null) {
			
			repositorio.delete(g);
		}		
		return g;
	}
	
}
