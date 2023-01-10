package org.ieslosremedios.daw1.prog.ut3.actividad34;

public interface Imprimible {                                           //1

    final String TEXTO_POR_DEFECTO = "Página de prueba";                //2

    void imprime();                                                     //1

    void establecerContenido(String establezcoContenido);               //5
}
