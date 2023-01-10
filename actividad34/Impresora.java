package org.ieslosremedios.daw1.prog.ut3.actividad34;

public class Impresora implements Imprimible, Borrable {            //3

    String pagina = TEXTO_POR_DEFECTO;                              //3

    @Override
    public void imprime() {                                         //3
        System.out.println(TEXTO_POR_DEFECTO);
    }

    @Override
    public void establecerContenido(String establezcoContenido) {   //5
            System.out.println(establezcoContenido);
        }

    @Override
    public void borrar() {                                          //6
        System.out.println("");
    }
}
