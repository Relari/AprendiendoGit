package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.repository.IPersonaRepo;

import java.util.List;
@RestController
@RequestMapping("/v1/personas")
public class PersonaRestController {

        @Autowired
        private IPersonaRepo repo;
        
         
        @GetMapping
        public List<Persona> listar() {
                return repo.findAll(); 
        }

        @PostMapping
        public void insertar (@RequestBody Persona per){
                repo.save(per);
        }
        @PostMapping
        public void modificar (@RequestBody Persona per){
                repo.save(per);
        }

        @DeleteMapping(value = "/(id)")
        public void eliminar (@PathVariable("id") Integer id) {
                repo.deleteById(id);
        }

 }



