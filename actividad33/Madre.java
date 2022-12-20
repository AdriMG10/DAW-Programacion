package org.ieslosremedios.daw1.prog.ut3.actividad33;

public class Madre extends Abuela {

    String dni;

    public Madre() {
    }

    public Madre(String nombre, Integer edad) {
    }

    public void imprimeSaludo() {
        System.out.println("Hola, soy " + getNombre() + " y tengo " + getEdad() + " años.");
    }

    public void imprimeDNI() {
        System.out.println("Mi DNI es: " + getDni());
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Integer getEdad() {
        return edad;
    }
}
