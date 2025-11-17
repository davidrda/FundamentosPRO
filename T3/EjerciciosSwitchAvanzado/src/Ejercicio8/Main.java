package Ejercicio8;
        /*
        **Objetivo:** Crear un programa que identifique el tipo de archivo según su extensión.

        **Requisitos:**

        1. Declara una variable `String extension` (por ejemplo: "jpg", "pdf", "txt", "mp3").
        2. Usa un `switch` para agrupar extensiones similares: Imágenes (jpg, png, gif), Documentos (pdf, doc, txt), Audio (mp3, wav), Video (mp4, avi).
        3. Muestra el tipo de archivo y el programa recomendado para abrirlo.
         */

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            // 1. Entrada del usuario
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa la extensión del archivo (sin punto): ");
            String extension = scanner.nextLine().toLowerCase(); // ejemplo: jpg, mp3, txt

            // 2. Evaluar la extensión con switch
            switch (extension) {
                case "jpg":
                case "png":
                case "gif":
                    System.out.println("Tipo: Imagen");
                    System.out.println("Puedes abrirlo con un visor de imágenes como Fotos o IrfanView.");
                    break;

                case "pdf":
                case "doc":
                case "txt":
                    System.out.println("Tipo: Documento");
                    System.out.println("Puedes abrirlo con Word, Adobe Reader o Notepad.");
                    break;

                case "mp3":
                case "wav":
                    System.out.println("Tipo: Audio");
                    System.out.println("Puedes reproducirlo con VLC o Spotify.");
                    break;

                case "mp4":
                case "avi":
                    System.out.println("Tipo: Video");
                    System.out.println("Puedes verlo con VLC, Windows Media Player o QuickTime.");
                    break;

                default:
                    System.out.println("Extensión desconocida.");
                    System.out.println("No se puede determinar con qué programa abrirlo.");
            }

            scanner.close();
        }
    }