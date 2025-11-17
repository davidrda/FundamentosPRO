public class Main {

    public static void main(String[] args) {
        /* System.out.println(DiasSemana.Lunes);
        System.out.println(DiasSemana.Martes);
        System.out.println(DiasSemana.Miercoles);
        System.out.println(DiasSemana.Jueves);
        System.out.println(DiasSemana.Viernes);
        System.out.println(DiasSemana.Sabado);
        System.out.println(DiasSemana.Domingo);
         */

        // switch uso con enums, y con valores con , (recordar que se necesita un level minimo de 14)
        /*
        DiasSemana dia = DiasSemana.Lunes;
        switch (dia){
            case Lunes, Martes, Miercoles, Jueves:
                System.out.println("Día laborable");
                break;
            case Viernes:
                System.out.println("Dia laborable, casi lo tenemos");
                break;
            case Sabado:
                System.out.println("Dia de descanso");
                break;
            case Domingo:
                System.out.println("Dia de descanso");
                break;
        }

         */

        //System.out.println("Hoy es 7 de "+MesesAnio.Noviembre+"y es "+DiasSemana.Viernes);
        //System.out.printf("Hoy es %d/%s/%d y es %s de un mes de la estacion de %s",7,MesesAnio.Noviembre.name(),2025,DiasSemana.Viernes.name(), MesesAnio.Noviembre.estacion);

        // switch con un rango de valores
        // si el numero esta entre 0 y 6 poner un sout
        // si el numero esta entre 7 y 10 poner un sout
        // si el numero esta entre 11 y 16 poner un sout
        // el restante
        /*
        if (n>0 && n<=&)
        else if (n<10)
        else if (n<16)
        else

         */
        // switch con rango -> level 23 y condicion valor como constante
        /*
        final int NUMERO = 6;
        switch (true){
            case (NUMERO>=0 && NUMERO<=6):
                System.out.println("asdasdasd");
            break;

            case (NUMERO>6 && NUMERO<10):
                System.out.println("asdasdasd");
                break;
        }
         */

        Operaciones operaciones = new Operaciones();
        operaciones.evaluarCodigo("caido");
    }
}
