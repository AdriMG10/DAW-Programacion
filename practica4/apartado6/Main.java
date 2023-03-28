package org.ieslosremedios.daw1.prog.ut4.practica4.apartado6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Sede sedeMadrid = new Sede("Madrid", "Ventas", "RR. HH.", "Producción");
        Sede sedeBarcelona = new Sede("Barcelona", "Ventas", "RR. HH.", "Producción");
        Sede sedeValencia = new Sede("Valencia", "Ventas", "RR. HH.", "Producción");
        Sede sedeOviedo = new Sede("Oviedo", "Ventas", "RR. HH.", "Producción");

        Empleado adri = new Empleado(00001, "30909599S", "Adrián", "Merino", "Gamaza", 2002, true);
    }
}
