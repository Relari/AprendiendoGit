package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.repository.IPersonaRepo;

@RestController
public class PersonaController {
	@Autowired
    private IPersonaRepo repo;


	@GetMapping("/Persona")
	public Persona greeting() {
		
        Persona p = new Persona ();
        p.setIdPersona(1);
        p.setNombre("Mitocode");
        repo.save(p);
        
        return p;

    }
}