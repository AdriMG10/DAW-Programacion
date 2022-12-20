package org.ieslosremedios.daw1.prog.ut3.actividad33;

public class Main {
    public static void main(String[] args) {

        Abuela abuela = new Abuela();
        abuela.setNombre("Manuela");
        abuela.setEdad(83);
        abuela.imprimeSaludo();
        abuela.imprimeGustos();

        Madre madre = new Madre();
        madre.setNombre("Rosa");
        madre.setEdad(45);

        Hija hija = new Hija();
        hija.setNombre("Pilar");
        hija.setEdad(11);
        hija.setDni("98764509E");

        hija.imprimeSaludo();
        hija.imprimeSaludo(hija.getNombre(), hija.getEdad());
    }
}
