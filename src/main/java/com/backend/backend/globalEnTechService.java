package com.backend.backend;

import java.util.List;

public interface globalEnTechService {
	List<globalEnTech>listar();
	globalEnTech listarId(int id);
	globalEnTech add(globalEnTech g);
	globalEnTech edit(globalEnTech g);
	globalEnTech delete(int id);
}
