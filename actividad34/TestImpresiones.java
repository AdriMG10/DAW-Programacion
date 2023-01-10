package org.ieslosremedios.daw1.prog.ut3.actividad34;

public class TestImpresiones {                                                                      //7
    public static void main(String[] args) {

        Impresora i = new Impresora();
        System.out.println("Imprimo desde la impresora: ");
        i.imprime();
        i.borrar();
        i.establecerContenido("Esto es un test");
        System.out.println("");                                                                     //Espacio para que quede más bonito al ejecutar

        Consola c = new Consola();
        System.out.println("Imprimo desde la consola: ");
        c.imprime();
        c.borrar();
        c.establecerContenido("Esto es un test");
    }
}
