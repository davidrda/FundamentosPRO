import controller.Agenda;
import model.Contacto;

import java.util.Calendar;
import java.util.Scanner;

public class MainAgenda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Agenda agenda = new Agenda();
        // listaContactos = null

        do {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Borrar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Listar contactos");
            System.out.println("5. Salir");
            System.out.println("Que opción quieres hacer?");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Introduce el nombre");
                    String nombre = scanner.next();
                    System.out.println("Introduce el apellido");
                    String apellido = scanner.next();
                    System.out.println("Introduce el correo");
                    String correo = scanner.next();
                    System.out.println("Introduce el DNI");
                    String dni = scanner.next();
                    System.out.println("Introduce el telefono");
                    int telefono = scanner.nextInt();

                    // Se crea nuevo contacto con los datos ingresados
                    Contacto contacto = new Contacto(nombre,apellido,correo,dni,telefono);

                    // Se envia a la agenda
                    agenda.agregarContacto(contacto);
                }
                case 2->{
                    System.out.println("Dime el dni de la persona a borrar");
                    String dni = scanner.next();
                    agenda.borrarContacto(dni);
                }
                case 3->{
                    System.out.println("Dime el dni de la persona a buscar");
                    String dni = scanner.next();
                    agenda.buscarContacto(dni);
                }
                case 4->{
                    agenda.listarContactos();
                }
                case 5->{
                    System.out.println("Salir");
                }
            }
        } while (opcion!=5);
    }
}
