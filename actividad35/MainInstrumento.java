package org.ieslosremedios.daw1.prog.ut3.actividad35;

public class MainInstrumento {
    public static void main(String[] args) {

        Instrumento a;

        a = new Guitarra();
        a.tocar();

        a = new Tambor();
        a.tocar();
    }
}
