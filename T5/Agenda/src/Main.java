import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    static ArrayList<Object[]> listaContactos = new ArrayList<>();
    public static void main(String[] args) {

        // guardar una agenda telefonica -> ArrayList<Object[]>
        // ArrayList -> lista con tamaño con tamaño modificable
            // ArrayList<Tipo de objeto guardado>
            // Object -> elemento que guarda cualquier tipo de dato
            // Object[] -> Lista con tamaño fijo de cualquier tipo
        // agenda.get(0) ->
            // contactos -> nombre, apellido, dni, telefono -> Object[]{nombre, apellido, dni, telefono}
        // ArrayList<Estudiante>
        // ((Estudiante)lista.get(0)).numeroEstudiante
        // ((Estudiante)lista.get(0)).numeroEstudiante
        // lista.get(0).numeroEstudiante
        // [{B,M,1234A,1234},{M,M,2345A,2345},{J,G,3456A,3456}]
        listaContactos.add(new Object[]{"Borja","Martin","1234A",1234});
        listaContactos.add(new Object[]{"Maria","Martin","2345A",2345});
        listaContactos.add(new Object[]{"Juan","Gomez","3456A",3456});

        // como borraria un elemento que tengo como dni 2345A?
        /*for (int i = 0; i < listaContactos.size(); i++) {
            Object[] contacto = listaContactos.get(i);
            if (contacto[2].equals("2345A")){
                // listaContactos.remove(i);
                listaContactos.remove(contacto);
                break;
            }
        }

         */
        boolean borrado = listaContactos.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test(Object[] objects) {
                return objects[2].equals("1234A"); // si retorna un TRUE, lo borra
            }
        });
        System.out.println("Se ha borrado algun elemento? "+borrado);

        mostrarContactos();
    }

    public static void mostrarContactos(){
        for (Object[] contacto: listaContactos){
            System.out.println("Imprimiendo datos de contacto");
            for (Object item: contacto){
                System.out.printf("\tNombre: %s Apellido: %s DNI: %s Telefono: %n",
                        contacto[0],contacto[1],contacto[2],(int)contacto[3]);
            }
        }
    }
}
