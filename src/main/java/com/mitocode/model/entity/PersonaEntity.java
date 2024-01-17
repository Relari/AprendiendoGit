package com.mitocode.model.entity;

import com.mitocode.util.SexoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Persona")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    
    @Column(name ="apellido", length = 50, nullable = false)
    private String apellido;

    @Enumerated(EnumType.STRING)
    @Column(name ="sexo", length = 1, nullable = false)
    private SexoEnum sexo;
    
    @Column(name = "fechaNacimiento", length = 50,nullable = false)
    private String  fechaNacimiento;
   
}

