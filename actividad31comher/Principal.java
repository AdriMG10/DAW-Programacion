package org.ieslosremedios.daw1.prog.ut3.actividad31comher;

public class Principal {
    public static void main(String[] args) {

        Socio p1 = new Socio();
        p1.setNombre("Adri");

        Direccion d1 = new Direccion();
        d1.setCalle("Ecuador");

        p1.setDireccion(d1);

        Premium e1 = new Premium();

        Direccion d2 = new Direccion();
        d2.setCalle("Corredera");

        e1.setDireccion(d2);

        Premium e2 = new Premium();
    }
}