package org.ieslosremedios.daw1.prog.ut3.actividad33;

public class Hija extends Madre {

    @Override
    public void imprimeSaludo() {
        System.out.println("Hola, soy " + getNombre() + " y tengo " + getEdad() + " años.");
    }

    @Override
    public void imprimeGustos() {
        super.imprimeGustos();
    }

    public void imprimeSaludo(String nombre, Integer edad) {
    }
}
