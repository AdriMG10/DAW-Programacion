package org.ieslosremedios.daw1.prog.ut4.arrays.actividad43;

import java.util.Arrays;

public class Actividad43 {
    public static void main(String[] args) {

        int [] arrayEj6 = {1, 2, 3};
        int[][] arrayClonar = new int[4][];

        System.out.println("Apartado 1: ");
        int[] array = generarArrayAleatorio(10);
        System.out.println(Arrays.toString(array) + "\n");

        System.out.println("Apartado 2: ");
        imprimirArrayInverso(array);
        System.out.println();

        System.out.println("Apartado 3: ");
        int[] arrayOrdenado = ordenarArray(array);
        System.out.println(Arrays.toString(arrayOrdenado) + "\n");

        System.out.println("Apartado 4: ");
        System.out.println("Búsqueda manual: " + buscarArray(arrayOrdenado, 55));
        System.out.println("Búsqueda binarySearch: " + Arrays.binarySearch(arrayOrdenado,55) + "\n");

        System.out.println("Apartado 5: ");
        System.out.println("Los arrays son iguales: " + compararArray(array, arrayOrdenado) + "\n");

        System.out.println("Apartado 6: ");

        System.out.println("Clone:");
        cloneArray(arrayEj6, arrayClonar);

        System.out.println("CopyOf:");
        copyOfArray(arrayEj6, arrayClonar);

        System.out.println("CopyOfRange:");
        copyOfRangeArray(arrayEj6, arrayClonar);

        System.out.println("System.arraycopy:");
        systemArrayCopyArray(arrayEj6, arrayClonar);

        System.out.println("Array completo: ");
        imprimirArray4(arrayClonar);
    }

    private static int[] generarArrayAleatorio(int num) {

        int[] a = new int[num];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        return a;
    }

    private static void imprimirArrayInverso(int[] a) {

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    private static int[] ordenarArray(int[] a) {

        Arrays.sort(a);

        return a;
    }

    private static int buscarArray(int[] input, int x) {

        for (int i = 0; i < input.length; i++) {
            if (x == input[i]) {
                return  i;
            }
        }
        return -1;
    }

    private static Boolean compararArray(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    private static void cloneArray(int[] array, int[][] arrayClon) {
        arrayClon[0] = array.clone();
        System.out.println(Arrays.toString(arrayClon[0]) + "\n");
    }

    private static void copyOfArray(int[] array, int[][] arrayClon) {

        arrayClon[1] = Arrays.copyOf(array, 3);
        System.out.println(Arrays.toString(arrayClon[1]) + "\n");
    }

    private static void copyOfRangeArray(int[] array, int[][] arrayClon) {

        arrayClon[2] = Arrays.copyOfRange(array, 0, 3);
        System.out.println(Arrays.toString(arrayClon[2]) + "\n");
    }

    private static void systemArrayCopyArray(int[] array, int[][] arrayClon) {

        int[] array4 = new int[3];
        System.arraycopy(array, 0, array4, 0, array.length);
        arrayClon[3] = array4;
        System.out.println(Arrays.toString(arrayClon[3]) + "\n");
    }

    private static void imprimirArray4(int[][] arrayClon) {
        System.out.println(Arrays.toString(arrayClon[0]) + (Arrays.toString(arrayClon[1]) + (Arrays.toString(arrayClon[2]) + (Arrays.toString(arrayClon[3])))));
    }
}
