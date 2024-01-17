package com.mitocode.model.api;

import java.io.Serializable;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@ToString
public class PersonaRequest implements Serializable {
   
    @NotBlank //Valores vacios
    @NotNull // Valores nulos
    private String nombre;
    
    @NotBlank //Valores vacios
    @NotNull // Valores nulos
    private String apellido;

    @Pattern(regexp = "[M|F]") // Expresion Regular para validar que el sexo sea M o F
    private String sexo;
    
    @NotBlank //Valores vacios
    @NotNull // Valores nulos
    private String  fechaNacimiento;
   
    @Pattern(regexp = "[0-9]{9}")
    private String telefono;
}

