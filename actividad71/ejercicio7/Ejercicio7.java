package org.ieslosremedios.daw1.prog.ut7.actividades.actividad71.ejercicio7;

import java.io.PrintWriter;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Operación Completada");
        writer.flush();
        writer.close();

        PrintWriter writer1 = null;
        writer1 = new PrintWriter("C:/testPrintWriter");
        writer1.write("Testeo dentro del fichero");
        writer1.flush();
        writer1.close();
    }
}