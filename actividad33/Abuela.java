package org.ieslosremedios.daw1.prog.ut3.actividad33;

public class Abuela {
    String nombre;
    Integer edad;

    public Abuela() {
    }

    public Abuela(String nombre, Integer edad) {
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

    public void imprimeSaludo() {
        System.out.println("Hola, soy " + getNombre() + " y tengo " + getEdad() + " años.");
    }

    public void imprimeGustos() {
        System.out.println("Me gusta la moda");
    }

    public void imprimeAbuela() {
        System.out.println("Soy la abuela");
    }
}
