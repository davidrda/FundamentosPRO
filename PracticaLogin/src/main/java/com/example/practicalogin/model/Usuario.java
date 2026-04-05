package com.example.practicalogin.model;

import lombok.*;

@Getter
@Setter

abstract public class Usuario {

    private String nombre, apellido, dni, correo, pass;

    public Usuario(String nombre, String apellido, String dni, String correo, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.pass = pass;
    }

    protected Usuario() {}

}
