import java.util.Scanner;

public class Controller {

    Scanner scanner = new Scanner(System.in);
    private int matriz;
    private int[][] cuadradoMagico;

    public void solicitarMatriz() { // Se pide el tamaño de la matriz
        System.out.print("Elige el tamaño de la matriz: ");
        matriz = scanner.nextInt();
        cuadradoMagico = new int[matriz][matriz];
    }

    public int calcularConstanteMagica() { // Se calcula la constante mágica
        return ((matriz * (matriz * matriz + 1)) / 2);
    }

    public void generarMatriz() {
        int totalNumeros = matriz * matriz;

        // Paso 1: Se crea un array con los números del 1 al n²
        int[] numeros = new int[totalNumeros];
        for (int i = 0; i < totalNumeros; i++) {
            numeros[i] = i + 1;
        }

        // Paso 2: Barajar los números del array
        for (int i = 0; i < totalNumeros; i++) {
            int aleatorio = (int) ((Math.random() * totalNumeros));
            int temp = numeros[i];
            numeros[i] = numeros[aleatorio];
            numeros[aleatorio] = temp;
        }

        // Paso 3: Rellenar la matriz
        int contador = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                cuadradoMagico[i][j] = numeros[contador];
                contador++;
            }
        }

    }


    public boolean esCuadradoMagico() {
        int constante = calcularConstanteMagica();

        // Filas
        for (int i = 0; i < matriz; i++) { // Si este bucle se termina, quiere decir que cada fila coincide con la constante mágica
            int sumaFila = 0;

            for (int j = 0; j < matriz; j++) {
                sumaFila += cuadradoMagico[i][j];
            }
            if (sumaFila != constante) {
                return false;
            }
        }

        // Columnas
        for (int j = 0; j < matriz; j++) {
            int sumaColumna = 0;

            for (int i = 0; i < matriz; i++) {
                sumaColumna += cuadradoMagico[i][j];
            }
            if (sumaColumna != constante){
                return false;
            }
        }

        // Diagonal principal
        int sumaDiagonalPrincipal = 0;

        for (int i = 0; i < matriz; i++) {
            sumaDiagonalPrincipal += cuadradoMagico[i][i];
        }
        if (sumaDiagonalPrincipal != constante) {
            return false;
        }

        // Diagonal secundaria
        int sumaDiagonalSecundaria = 0;

        for (int i = 0; i < matriz; i++) {

            sumaDiagonalSecundaria += cuadradoMagico[i][matriz - 1 - i]; // El for incrementa la i pero con [matriz - 1 - i] disminuye la i

        }
        if (sumaDiagonalSecundaria != constante) {
            return false;
        }
        return true;
    }

    public void imprimirMatriz() {

        System.out.println("Imprimiendo matriz " + matriz + "x" + matriz);
        for (int[] fila : cuadradoMagico) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public void buscarCuadradoMagico() {

        int constante = calcularConstanteMagica();
        long intentos = 0;

        do {
            intentos++;
            generarMatriz();
        } while (!esCuadradoMagico());
        System.out.println("=== CUADRADO MÁGICO ENCONTRADO ===");
        imprimirMatriz();
        System.out.println("Constante mágica: "+constante);
        System.out.println("Intentos realizados: "+intentos);
    }
}
