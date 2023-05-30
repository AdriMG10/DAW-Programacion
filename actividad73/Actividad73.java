package org.ieslosremedios.daw1.prog.ut7.actividades.actividad73;

import java.io.Serializable;

public class Actividad73 implements Serializable {

    private static final long serialVersionUID = -3510440781563957894L;

    String persona1;
    String persona2;
    String persona3;

    public Actividad73(String persona1, String persona2, String persona3) {
        this.persona1 = persona1;
        this.persona2 = persona2;
        this.persona3 = persona3;
    }

    public Actividad73() {
        this.persona1 = "Xixareto";
        this.persona2 = "Pajuelo";
        this.persona3 = "Victitor";
    }
}
