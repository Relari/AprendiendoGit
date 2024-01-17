package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.api.PersonaRequest;
import com.mitocode.model.api.PersonaResponse;
import com.mitocode.model.entity.PersonaEntity;
import com.mitocode.service.IPersonaService;

import jakarta.validation.Valid;

import java.util.List;
@RestController
@RequestMapping("/v1/personas")
public class PersonaRestController {

        /*@Autowired
        private IPersonaRepo repo;
        */

        @Autowired
        private IPersonaService service;
         
        @GetMapping
        public List<PersonaResponse> listar() {
                //return repo.findAll();
                return service.personas(); 
        }

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public void insertar (@RequestBody @Valid PersonaRequest request){
                //repo.save(per);

                service.registrar(request);
        }
        @PutMapping
        public void modificar (
                @PathVariable("id") Integer id,
                @RequestBody @Valid PersonaRequest request){
               // repo.save(per);
        }

        @DeleteMapping(value = "/{id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void eliminar (@PathVariable("id") Integer id) {
                service.eliminar(id);
        }

 }



