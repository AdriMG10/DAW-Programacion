package org.ieslosremedios.daw1.prog.ut5.actividad53;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Actividad53 {
    public static void main(String[] args) {

        Integer[] array = {2, 7, 2, 5, 2};

        instanciasNumero(array);
    }

    public static void instanciasNumero(Integer[] array) {

        Map<Integer, Integer> contador = new TreeMap<>();

        for (Integer clave :array) {
                if (contador.containsKey(clave)) {
                    contador.put(clave, contador.get(clave) + 1);
                } else {
                    contador.put(clave, 1);
                }
        }

        Iterator<Integer> itElementos = contador.keySet().iterator();
        while (itElementos.hasNext()) {
            Integer key = itElementos.next();
            System.out.print(key + " = " + contador.get(key) + "\n");
        }
    }
}
