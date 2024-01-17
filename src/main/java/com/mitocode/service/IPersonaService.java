package com.mitocode.service;

import java.util.List;

import com.mitocode.model.api.PersonaRequest;
import com.mitocode.model.api.PersonaResponse;

public interface IPersonaService {

	void registrarNombre(String nombre);
	
	void registrar(PersonaRequest request);

	void eliminar(Integer id);

	List<PersonaResponse> personas();
 
}
