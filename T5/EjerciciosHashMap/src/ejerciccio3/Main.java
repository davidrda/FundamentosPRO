package ejerciccio3;

public class Main {

    public static void main(String[] args) {

        Diccionario diccionario = new Diccionario();
        diccionario.agregarTraduccion("Hola","Hello");
        diccionario.agregarTraduccion("Adios", "Goodbye");
        diccionario.agregarTraduccion("Gato", "Cat");

        System.out.println();
        System.out.println(diccionario.traducir("Adios"));
        System.out.println(diccionario.traducir("Television"));

        String[][] traducciones = {
                {"hola", "hello"},
                {"mundo", "world"},
                {"como", "how"},
                {"estas", "are"}
        };

        diccionario.agregarVariasTraducciones(traducciones);

        System.out.println();
        System.out.println("Listado del diccionario:");
        diccionario.listarDiccionario();

        System.out.println();
        System.out.print("Tamaño del diccionario: ");
        System.out.println(diccionario.tamanioDiccionario());

        diccionario.traducirFrase("hola mundo como estas");
    }
}
