package com.backend.backend;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface globalEnTechRepositorio extends Repository<globalEnTech, Integer>{
	List<globalEnTech>findAll();
	globalEnTech findById(int id);
	globalEnTech save(globalEnTech g);
	void delete(globalEnTech g);
}
