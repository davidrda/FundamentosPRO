package controller;

import model.Contacto;

import java.util.ArrayList;

public class Agenda {

    // [nombre, apellido, telefono, correo, dni]
    // Nunca se inicializa aquí
    private ArrayList<Contacto> listaContactos;

    // Se inicializa en el constructor o en el metod que se vaya a utilizar
    public Agenda(){
        listaContactos = new ArrayList<>();
    }

    // agregarContacto
    public void agregarContacto(Contacto contacto) { // creamos nosotros un Objecto de tipo contacto
        if (existeEmail(contacto.getEmail())){
            System.out.println("Ya existe un contacto con ese email");
        } else {
            listaContactos.add(contacto);
            System.out.println("Contacto agregado correctamente");
        }

    }
    public boolean existeEmail(String email){
        // Recorres la lista de contactos, asignando el nombre contacto a cada contacto
        for (Contacto contacto : listaContactos){
            if (contacto != null && contacto.getEmail().equals(email)){
                return true; // Devuelve true si ya hay un contacto con ese email
            }

        }
        return false;
    }

    // buscarContacto
    public void buscarContacto(String dni){

        for (Contacto contacto: listaContactos){
            if (contacto.getDni().equals(dni)){
                System.out.println("Contacto encontrado");
                System.out.println(contacto);
                return;
            }
        }
        System.out.println("Contacto no encontrado");
    }

    // borrarContacto
    public void borrarContacto(String dni) {
        for (int i = 0; i < listaContactos.size(); i++) {
            Contacto contacto = listaContactos.get(i); // obtenemos el contacto en esa posición
            if (contacto.getDni().equals(dni)) {
                listaContactos.remove(i); // eliminamos el contacto por su posición
                System.out.println("Contacto eliminado.");
                return; // salimos del método
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    // listarContactos
    public void listarContactos(){
        for (Contacto contacto : listaContactos){
                System.out.println("Imprimiendo contacto");
                System.out.println("\tNombre: "+contacto.getNombre());
                System.out.println("\tTelefono: "+contacto.getTelefono());
                System.out.println("\tCorreo: "+contacto.getEmail());
                System.out.println("\tDNI: "+contacto.getDni());
                break;
        }
    }
}
