package com.mitocode.model.api;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
public class PersonaResponse {



    private int idPersona;

   
    private String nombre;
    
   
    private String apellido;

    
    private String sexo;
    
   
    private String  fechaNacimiento;
   
}

