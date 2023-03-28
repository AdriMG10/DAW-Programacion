package org.ieslosremedios.daw1.prog.ut5.actividad51;

import org.ieslosremedios.daw1.prog.ut5.conjuntos.Persona;
import org.ieslosremedios.daw1.prog.ut5.conjuntos.PersonaNombreInversoEdad;

import java.util.SortedSet;
import java.util.TreeSet;

public class Actividad51 {
    public static void main(String[] args) {

        SortedSet<Persona> personas = new TreeSet<>(new PersonaNombreInversoEdad().reversed());
        personas.add(new Persona("Lucas", 19));
        personas.add(new Persona("María", 15));
        personas.add(new Persona("Tomás", 24));

        System.out.println(personas);
    }
}
