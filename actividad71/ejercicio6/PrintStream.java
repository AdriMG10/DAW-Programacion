package org.ieslosremedios.daw1.prog.ut7.actividades.actividad71.ejercicio6;

public class PrintStream {
    public static void main(String[] args) {

        String data = "Texto dentro del archivo";

        try {
            java.io.PrintStream output = new java.io.PrintStream("printStream.txt");

            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
