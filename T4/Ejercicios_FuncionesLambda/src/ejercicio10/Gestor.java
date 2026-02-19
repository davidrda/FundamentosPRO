package ejercicio10;

import java.util.List;
import java.util.function.*;

public class Gestor {

    /* =========================================
       1️⃣ BiFunction → calcular nota final
       ========================================= */

    private BiFunction<Double, Double, Double> calculoNotaFinal =
            (teoria, practica) -> (teoria * 0.60) + (practica * 0.40);


    /* =========================================
       2️⃣ BiPredicate → comprobar aprobado
       ========================================= */

    private BiPredicate<Double, Double> verificacionAprobado =
            (notaFinal, minimo) -> notaFinal >= minimo;


    /* =========================================
       3️⃣ Function → convertir nota a letra
       ========================================= */

    private Function<Double, String> conversionNotaLetra = nota -> {
        if (nota >= 9) return "A";
        else if (nota >= 7) return "B";
        else if (nota >= 6) return "C";
        else if (nota >= 5) return "D";
        else return "F";
    };


    /* =========================================
       4️⃣ BiConsumer → imprimir informe
       ========================================= */

    private BiConsumer<Alumno, Double> imprimirInforme =
            (alumno, notaFinal) -> {

                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Teoría: " + alumno.getNotaTeoria());
                System.out.println("Práctica: " + alumno.getNotaPractica());
                System.out.println("Nota final: " + notaFinal);
                System.out.println("Letra: " + conversionNotaLetra.apply(notaFinal));
                System.out.println("Aprobado: " +
                        verificacionAprobado.test(notaFinal, 5.0));
                System.out.println("-----------------------------------");
            };


    /* =========================================
       5️⃣ Predicate → filtrar aprobados
       ========================================= */

    private Predicate<Alumno> filtroAprobados =
            alumno -> verificacionAprobado.test(
                    calcularNotaFinal(alumno),
                    5.0
            );


    /* =========================================
       MÉTODOS AUXILIARES
       ========================================= */

    public double calcularNotaFinal(Alumno alumno) {
        return calculoNotaFinal.apply(
                alumno.getNotaTeoria(),
                alumno.getNotaPractica()
        );
    }

    public boolean haAprobado(Alumno alumno) {
        return verificacionAprobado.test(
                calcularNotaFinal(alumno),
                5.0
        );
    }

    public void generarInforme(List<Alumno> alumnos) {
        alumnos.forEach(alumno -> {
            double notaFinal = calcularNotaFinal(alumno);
            imprimirInforme.accept(alumno, notaFinal);
        });
    }

    public void mostrarAprobados(List<Alumno> alumnos) {
        alumnos.stream()
                .filter(filtroAprobados)
                .forEach(alumno ->
                        System.out.println(alumno.getNombre()));
    }
}
