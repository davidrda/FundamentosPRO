package ejercicio1;

import java.util.HashMap;

public class AgendaContacto {

    HashMap<String, String> contactos;

    public AgendaContacto() {
        contactos = new HashMap<>();
    }

    public AgendaContacto(HashMap<String, String> contactos) {
        this.contactos = contactos;
    }

    public void agregarContacto(String nombre, String telefono) {
        if (contactos.containsValue(telefono)){
            System.out.println("El contacto ya está asociado");
        } else {
            contactos.put(nombre, telefono);
            System.out.println("Contacto agregado: " + nombre + ", " + telefono);
        }
    }

    public String buscarContacto(String nombre){
        if (contactos.containsKey(nombre)){
            return contactos.get(nombre);
        } else {
            return "Contacto no encontrado";
        }
    }

    public boolean eliminarContacto(String nombre){
        if (contactos.containsKey(nombre)){
            contactos.remove(nombre);
            System.out.println("Contacto eliminado");
            return true;
        } else {
            System.out.println("No existe este contacto");
            return false;
        }
    }

    public void listarContactos(){
        System.out.println("Listado de contactos:");
        for (String nombre: contactos.keySet()){
            String telefono = contactos.get(nombre);
            System.out.println(nombre + ", " + telefono);
        }
    }

    public int contarContactos(){
        System.out.print ("Total de contactos: ");
        return contactos.size();
    }

    public boolean existeContacto(String nombre){
        if (contactos.containsKey(nombre)){
            System.out.print("¿Existe?: ");
            return true;
        } else {
            return false;
        }
    }


    public HashMap<String, String> getContactos() {
        return contactos;
    }

    public void setContactos(HashMap<String, String> contactos) {
        this.contactos = contactos;
    }
}
