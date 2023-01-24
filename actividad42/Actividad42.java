package org.ieslosremedios.daw1.prog.ut4.actividad42;

import java.util.Arrays;

public class Actividad42 {
    public static void main(String[] args) {

        int[][][] multiplicacion = new int[10][10][3];

        for(int i = 1; i <= 10; i++) {
            multiplicacion[i - 1] = multiplicarTablas(i);
        }

        imprimirTablas(multiplicacion);
    }

    private static int[][] multiplicarTablas(int num) {

        int[][] tablaMult = new int[10][3];

        for(int i = 0; i < tablaMult.length; i++) {
            tablaMult[i][0] = num;
            tablaMult[i][1] = i + 1;
            tablaMult[i][2] = num * tablaMult[i][1];
        }

        return tablaMult;
    }

    private static void imprimirTablas (int[][][] tabla) {
        
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Tabla del " + (i + 1) + ":\t");

            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(Arrays.toString(tabla[i][j]) + "\t");
            }

            System.out.println();
        }
    }
}