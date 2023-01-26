package org.ieslosremedios.daw1.prog.ut4.actividad44;

public class Persona {

    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {

        String persona = "Me llamo " + nombre + " y tengo " + edad + " años";

        return persona;
    }
}
