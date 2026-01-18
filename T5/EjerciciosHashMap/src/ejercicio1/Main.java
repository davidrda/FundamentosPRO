package ejercicio1;

public class Main {

    public static void main(String[] args) {

        AgendaContacto agenda = new AgendaContacto();
        agenda.agregarContacto("David","123");
        agenda.agregarContacto("David","123");
        System.out.println(agenda.buscarContacto("David"));
        agenda.eliminarContacto("David");
        agenda.agregarContacto("Vanessa","7839");
        agenda.agregarContacto("Facundo","0000");
        agenda.listarContactos();
        System.out.println(agenda.contarContactos());
        agenda.agregarContacto("Adrian","4789");
        System.out.println(agenda.contarContactos());
        System.out.println(agenda.existeContacto("Adrian"));

    }
}
