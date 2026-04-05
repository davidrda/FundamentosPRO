package com.example.practicalogin.service;

import com.example.practicalogin.model.Trabajador;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GestorFichajes {

    public void registrarFichaje(Trabajador trabajador){

        try (
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("horas.txt", true))
                ){
            LocalDateTime ahora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
            String fechaHora = ahora.format(formato);
            String linea =  trabajador.getNombre() + " " + trabajador.getApellido()
                    + " (" + trabajador.getCorreo() + ") - " + fechaHora;
            bufferedWriter.write(linea);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public String verRegistros(){

        // Esto es como la pizarra donde se acumula cada línea del fichero
        StringBuilder contenido = new StringBuilder();

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader("horas.txt"))
        ){
            String linea;
            while ((linea = bufferedReader.readLine()) != null ) {
                contenido.append(linea); // añade la linea a la pizarra con un salto de línea
                contenido.append("\n");
            }
        } catch (IOException e) {
            return "No hay registros de fichaje todavía";
        }

        return contenido.toString();
    }
}
