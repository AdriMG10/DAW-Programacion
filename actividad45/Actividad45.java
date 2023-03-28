package org.ieslosremedios.daw1.prog.ut4.arrays.actividad45;

import java.util.Arrays;

public class Actividad45 {
    public static void main(String[] args) {

        int[] array = {1, 3, 7, 9};
        int e = 7;
        int pos = 3;

        System.out.println("ACTIVIDAD 4.5\n");
        System.out.println("Apartado 1.1:\n" + "Array recibido: " + Arrays.toString(array));
        System.out.println("Array tras añadir el elemento: " + Arrays.toString(insertarElementoArray(array, e, pos - 1)) + "\n");


        int[] arrayInsertar = {4, 5, 6};

        System.out.println("Apartado 1.2:\n" + "Array recibido: " + Arrays.toString(array));
        System.out.println("Array tras añadir el array: " + Arrays.toString(insertarElementoArray(array, arrayInsertar, pos - 1)) + "\n");


        boolean eliminacionLogica = true;
        boolean eliminacionFisica = false;
        String uno = "Tipo de borrado lógico";
        String dos = "Tipo de borrado físico";

        System.out.println("Apartado 2:\n" + "Array recibido: " + Arrays.toString(array) + "\n" + uno + " del elemento " + e);
        System.out.println("Array tras borrar el elemento: " + Arrays.toString(eliminarElementoArray(array, e, eliminacionLogica)) + "\n");


        System.out.println("Apartado 3:\n" + "Array recibido: " + Arrays.toString(array));
        System.out.println("Array tras intercambiar posiciones: " + Arrays.toString(intercambiarPosiciones(array)));
    }

    private static int[] insertarElementoArray(int[] array, int e, int pos) {

        int[] copia = Arrays.copyOf(array, array.length + 1);

        for (int i = copia.length - 1; i > pos; i--) {
            copia[i] = array[i - 1];
        }

        copia[pos] = e;

        return copia;
    }

    private static int[] insertarElementoArray(int[] array, int[] arrayInserta, int pos) {

        int[] nuevoArray = Arrays.copyOf(array, array.length + arrayInserta.length);

        for (int i = 0; i < pos; i++) {
            nuevoArray[i] = array[i];
        }

        for (int i = 0; i < arrayInserta.length; i++) {
            nuevoArray[pos + i] = arrayInserta[i];
        }

        for (int i = pos + arrayInserta.length; i < nuevoArray.length; i++) {
            nuevoArray[i] = array[i - arrayInserta.length];
        }

        return nuevoArray;
    }

    public static int[] eliminarElementoArray(int[] array, int elemento, boolean booleano) {
        if (booleano == true) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == elemento)
                    array[i] = 0;
            }
            return array;
        }
        else {
            for (int i = 0; i < array.length; i++){
                if (array[i] == elemento) {
                    int[] arrayReducido = new int[array.length - 1];
                    return arrayReducido;
                }
            }
        }
        return array;
    }

    private static int[] intercambiarPosiciones(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0 && i + 1 < array.length) {
                int pos = array[i];
                array[i] = array[i + 1];
                array[i + 1] = pos;
            }
        }
        return array;
    }
}

