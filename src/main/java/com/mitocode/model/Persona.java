package com.mitocode.model;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;
    @Column(name = "nombre", length = 50)
    private String nombre;
    
    @Column(name ="apellido", length = 50)
    private String apellido;
    @Column(name ="sexo", length = 50)
    private String sexo;
    @Column(name = "fechaNacimiento", length = 50)
    private String  fechaNacimiento;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
}

