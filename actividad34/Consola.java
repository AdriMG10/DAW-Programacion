package org.ieslosremedios.daw1.prog.ut3.actividad34;

public class Consola implements Imprimible, Borrable {                  //4

    String pantalla = "$";                                              //4
    String prompt = "$";

    Consola() {
        pantalla = Imprimible.TEXTO_POR_DEFECTO;
    }

    @Override
    public void imprime() {                                             //4
        System.out.printf("%S", pantalla);
    }

    @Override
    public void establecerContenido(String establezcoContenido) {       //5
        pantalla = prompt + " " + establezcoContenido;
    }

    @Override
    public void borrar() {                                              //6
        System.out.println(" *****");
    }
}
