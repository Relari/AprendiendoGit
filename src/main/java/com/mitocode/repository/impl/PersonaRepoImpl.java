package com.mitocode.repository.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mitocode.repository.IPersonaRepo;

public class PersonaRepoImpl implements IPersonaRepo {

	private static Logger LOG = LoggerFactory.getLogger(PersonaRepoImpl.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("SE REGISTRO A " + nombre);

	}

}
