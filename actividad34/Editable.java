package org.ieslosremedios.daw1.prog.ut3.actividad34;

public interface Editable extends Borrable, Imprimible {            //8

    void establecerContenido(String establezcoContenido);           //Sigue funcionando igual, porque admite herencia múltiple
}                                                                   //He interpretado que hay una errata y en vez de "Imprimible" es "Editable"
