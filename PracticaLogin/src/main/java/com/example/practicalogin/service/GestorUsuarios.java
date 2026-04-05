package com.example.practicalogin.service;

import com.example.practicalogin.model.Administrador;
import com.example.practicalogin.model.Trabajador;
import com.example.practicalogin.model.Usuario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorUsuarios {

    List<Trabajador> listaTrabajadores = new ArrayList<>();
    List<Administrador> listaAdministradores;

    public GestorUsuarios() {
        this.listaAdministradores = new ArrayList<>();
        this.listaAdministradores.add(
                new Administrador("David", "Ramirez", "128832A", "david@gmail.com", "1234"));
    }

    public boolean darDeAlta(Trabajador trabajador){
        for (Trabajador t : listaTrabajadores){
            if (trabajador.getDni().equals(t.getDni())){
                return false;
            }
        }
        listaTrabajadores.add(trabajador);
        return true;
    }

    public boolean darDeBaja(String dni){
        for (Trabajador t : listaTrabajadores){
            if (t.getDni().equals(dni)){
                listaTrabajadores.remove(t);
                return true;
            }
        }
        return false;
    }

    public Trabajador verDatos(String dni){
        for (Trabajador t : listaTrabajadores){
            if (t.getDni().equals(dni)){
                return t;
            }
        }
        return null;
    }

    public boolean cambiarPass(String dni, String newPass){
        for (Trabajador t : listaTrabajadores){
            if (t.getDni().equals(dni)){
                t.setPass(newPass);
                return true;
            }
        }
        return false;
    }

    public List<Trabajador> verTrabajadores(){
        return listaTrabajadores;
    }


    public Usuario autenticar(String correo, String pass){
        for (Trabajador t : listaTrabajadores){
            if (t.getCorreo().equals(correo) && t.getPass().equals(pass)) {
                return t;
            }
        }
        for (Administrador a : listaAdministradores) {
            if (a.getCorreo().equals(correo) && a.getPass().equals(pass)){
                return a;
            }
        }
        return null;
    }

}
