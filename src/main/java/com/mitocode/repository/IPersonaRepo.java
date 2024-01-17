package com.mitocode.repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.model.entity.PersonaEntity;
@Repository
public interface  IPersonaRepo extends JpaRepository<PersonaEntity, Integer>  {
	//void registrar(String nombre);
}
