
package com.mitocode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDireccion;

    @Column(name = "calle", length = 100, nullable = false, unique = true)
    private String calle;

    @Column(name = "ciudad", length = 50)
    private String ciudad;

    @Column(name = "codigo_postal", length = 10)
    private String codigoPostal;
}
    

