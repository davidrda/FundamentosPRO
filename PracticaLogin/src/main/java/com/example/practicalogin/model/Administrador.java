package com.example.practicalogin.model;

import lombok.*;

@Getter
@Setter
@Data
@EqualsAndHashCode(callSuper = true)
public class Administrador extends Usuario{

    public Administrador(String nombre, String apellido, String dni, String correo, String pass) {
        super(nombre, apellido, dni, correo, pass); // llama al constructor del padre
    }
}
