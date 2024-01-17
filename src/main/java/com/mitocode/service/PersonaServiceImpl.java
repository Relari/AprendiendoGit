package com.mitocode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.api.PersonaRequest;
import com.mitocode.model.api.PersonaResponse;
import com.mitocode.model.entity.PersonaEntity;
import com.mitocode.repository.IPersonaRepo;
import com.mitocode.repository.PersonaRepoImpl;
import com.mitocode.util.SexoEnum;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepo repo;

	@Override
	public void registrarNombre(String nombre) {
		//repo=new PersonaRepoImpl();
		//repo.registra(nombre);

		System.out.println(nombre);
	}

	@Override
	public void registrar(PersonaRequest request) {
		
		// Declarando e inicializando el objecto PersonaEntity
		PersonaEntity entity = new PersonaEntity();

		// Llenando la informacion de la request al objecto PersonaEntity
		entity.setNombre(request.getNombre());
		entity.setApellido(request.getApellido());
		entity.setFechaNacimiento(request.getFechaNacimiento());
		entity.setSexo(SexoEnum.valueOf(request.getSexo()));
				// ...

		// Guardando la informacion en la base de datos.
		repo.save(entity);

	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public List<PersonaResponse> personas() {
		
		// Declarando la variable e llenando lo que la base de datos tiene almacenado.
		List<PersonaEntity> personasEntities = repo.findAll();

		// Declarando e Inicializando la lista de PersonaResponse
		List<PersonaResponse> personasResponses = new ArrayList<>();

		// Bucle For tradicional

		for (int i = 0; i < personasEntities.size(); i++) {
			
			// Declarando e inicializando el objecto PersonaResponse
			PersonaResponse personaResponse = new PersonaResponse();

			// Llenando la informacion de la base de datos al objecto PersonaResponse
			personaResponse.setIdPersona(personasEntities.get(i).getIdPersona());
			personaResponse.setNombre(personasEntities.get(i).getNombre());
			personaResponse.setFechaNacimiento(personasEntities.get(i).getFechaNacimiento());
			personaResponse.setSexo(personasEntities.get(i).getSexo().name()); 
			personaResponse.setApellido(personasEntities.get(i).getApellido());
			// ...

			// Agregando el objeto PersonaResponse a la lista.
			personasResponses.add(personaResponse);

		}

		// Bucle Foreach
/**
		for (PersonaEntity personaEntity : personasEntities) {
			// Declarando e inicializando el objecto PersonaResponse
			PersonaResponse personaResponse = new PersonaResponse();

			// Llenando la informacion de la base de datos al objecto PersonaResponse
			personaResponse.setIdPersona(personaEntity.getIdPersona());
			// ...

			// Agregando el objeto PersonaResponse a la lista.
			personasResponses.add(personaResponse);
		}
 */
		return personasResponses;
	}
}
	