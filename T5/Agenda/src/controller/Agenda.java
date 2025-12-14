package controller;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Agenda {

    // [nombre, apellido, telefono, correo, dni]
    // Nunca se inicializa aquí
    private ArrayList<Object[]> listaContactos;

    // Se inicializa en el constructor o en el metod que se vaya a utilizar
    public Agenda(){
        listaContactos = new ArrayList<>();
    }

    // agregarContacto
    public void agregarContacto(Object[] contacto){ // creamos nosotros un Objecto de tipo contacto
        listaContactos.add(contacto);
        System.out.println("Agregado correctamente");
        // no puede haber dnis duplicados
    }

    // buscarContacto
    public void buscarContacto(String dni){
        if (listaContactos.isEmpty()){
            System.out.println("No hay nada que buscar");
        } else {
            for (Object[] contacto: listaContactos){
                if (contacto[4].equals(dni)){
                    System.out.println("Contacto encontrado");
                    System.out.println("Nombre: "+contacto[0]);
                    System.out.println("Telefono: "+contacto[3]);
                    System.out.println("Correo: "+contacto[2]);
                    break;
                }
            }
            System.out.println("Usuario no encontrado");
        }
    }
    // borrarContacto
    public void borrarContacto(String dni){
        if (listaContactos.isEmpty()){
            System.out.println("No hay nada que borrar");
        } else {
            /*listaContactos.removeIf(new Predicate<Object[]>() {
                @Override
                public boolean test(Object[] objects) {
                    return objects[4].equals(dni);
                }
            }){

            }
             */
            for (Object[] contacto: listaContactos){
                if (contacto[4].equals(dni)){
                    listaContactos.remove(contacto);
                }
            }
            System.out.println("Usuario no encontrado");
        }
    }
    // listarContactos
    public void listarContactos(){
        for (Object[] contacto: listaContactos){
                System.out.println("Imprimiendo contacto");
                System.out.println("\tNombre: "+contacto[0]);
                System.out.println("\tTelefono: "+contacto[3]);
                System.out.println("\tCorreo: "+contacto[2]);
                break;
        }
    }

    public ArrayList<Object[]> getListaContactos() {
        return listaContactos;
    }
}
