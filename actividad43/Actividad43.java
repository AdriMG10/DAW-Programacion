package org.ieslosremedios.daw1.prog.ut4.actividad43;

import java.util.Arrays;

public class Actividad43 {
    public static void main(String[] args) {


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
        System.out.println("Los arrays son iguales: " + Arrays.equals(array, arrayOrdenado) + "\n");

        System.out.println("Apartado 6: ");
        System.out.println("Clone:");
        int[] array2 = array.clone();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2) + "\n");

        System.out.println("CopyOf:");
        int[] array3 = Arrays.copyOf(array, 4);
        System.out.println(Arrays.toString(array3) + "\n");

        System.out.println("CopyOfRange:");
        int[] array4 = Arrays.copyOfRange(array, 4, 8);
        System.out.println(Arrays.toString(array4) + "\n");

        System.out.println("System.arraycopy:");
        //System.arraycopy(array, 0, array2, 0, array.length);
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
}
