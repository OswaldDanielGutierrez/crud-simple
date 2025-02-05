package org.example.proyecto02.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int sueldo;
    private String email;
    private int anosExperiencia;
    private String numeroCelular;
}
