package org.ieslosremedios.daw1.prog.ut7.actividades.actividad71.ejercicio6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputStreamClass {
    public static void main(String[] args) throws IOException {
        java.io.FileOutputStream fileOutputStream = null;
        try {
            // Crear Stream
            fileOutputStream = new java.io.FileOutputStream("FlujoFicheroBinario.bin");
            // Escribir Stream
            fileOutputStream.write("Hola".getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
            e.printStackTrace();
        } finally {             // Se imprime siempre
            // Cerrar Stream
            fileOutputStream.close();
        }
    }
}