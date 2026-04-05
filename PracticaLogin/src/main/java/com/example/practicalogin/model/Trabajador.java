package com.example.practicalogin.model;

import lombok.*;

@Getter
@Setter
@Data
@EqualsAndHashCode(callSuper = true) // incluye los campos del padre en equals/hashCode
public class Trabajador extends Usuario{
    public Trabajador(String nombre, String apellido, String dni, String correo, String pass) {
        super(nombre, apellido, dni, correo, pass);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
