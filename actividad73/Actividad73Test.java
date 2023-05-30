package org.ieslosremedios.daw1.prog.ut7.actividades.actividad73;


import java.io.*;

public class Actividad73Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Creo objeto que voy a serializar para escribirlo en un fichero
        Actividad73 ej10 = new Actividad73();

        // Creo fichero
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Adri\\Downloads\\Ejercicio10.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Serializar el objeto
        oos.writeObject(ej10);

        // Cierro el flujo para que se escriba en el fichero
        oos.close();

        // Leer el fichero al Objeto
        FileInputStream fis = new FileInputStream("C:\\Users\\Adri\\Downloads\\Ejercicio10.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Deserializar el contenido del fichero (bytes) a un Object
        Actividad73 osSalida = (Actividad73)ois.readObject();

        System.out.println("Persona 1: " + osSalida.persona1);
        System.out.println("Persona 2: " + osSalida.persona2);
        System.out.println("Persona 3: " + osSalida.persona3);

        ois.close();
    }
}
