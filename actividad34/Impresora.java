package org.ieslosremedios.daw1.prog.ut3.actividad34;

public class Impresora implements Imprimible, Borrable {            //3

    private String pagina;                                          //3

    Impresora() {
        pagina = Imprimible.TEXTO_POR_DEFECTO;
    }

    @Override
    public void imprime() {                                         //3
        System.out.println(TEXTO_POR_DEFECTO);
    }

    @Override
    public void establecerContenido(String establezcoContenido) {   //5
            pagina = establezcoContenido;
        }

    @Override
    public void borrar() {                                          //6
        pagina = "";
    }
}
