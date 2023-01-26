package org.ieslosremedios.daw1.prog.ut4.actividad44;

import java.util.Arrays;

public class Actividad44 {
    public static void main(String[] args) {

        Persona p1 = new Persona("Adri", 20);
        Persona p2 = new Persona("Paula", 19);
        Persona p3 = new Persona("Manolo", 42);

        Persona[] personas = {p1, p2, p3};

        System.out.println(personas);

        System.out.println(Arrays.toString(personas));
    }
}
