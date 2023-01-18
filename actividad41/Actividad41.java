package org.ieslosremedios.daw1.prog.ut4.actividad41;

public class Actividad41 {
    public static void main(String[] args) {

        int x = 1;
        String s = "Adri";
        Double[] a = {1d, 2d, 3d, 4d, 5d};

        System.out.println("Antes del método:");
        System.out.println(x);
        m(x);
        System.out.println("Después del método:");
        System.out.println(x);
        System.out.println("");

        System.out.println("Antes del método:");
        System.out.println(s);
        m(x, s);
        System.out.println("Después del método:");
        System.out.println(s);
        System.out.println("");

        System.out.println("Antes del método:");
        System.out.println(a[0]);
        System.out.println((a.length - 1)/2);
        System.out.println(a.length - 1);
        m(x, s, a);
        System.out.println("Después del método:");
        System.out.println(a[0]);
        System.out.println((a.length - 1)/2);
        System.out.println(a.length - 1);
    }

    private static void m (int x) {
        x += 1;
    }

    private static void m (int x, String s) {
        s = s.toUpperCase();
        m(x);                                       //Llamo al otro método
    }

    private static void m (int x, String s, Double[] a) {
        a[0] += 1;
        a[(a.length - 1)/2] += 1;
        a[a.length - 1] += 1;

        m(x, s);                                    //Llamo al método anterior, que a su vez llama al anterior
    }

    private static int[][] m2 (int x, String s, Double[] input) {
        int n = input.length;
        int m = 2;
        int[][] output = new int[n][m];

        m(x, s, input);

        output[0][0] = (int)Math.floor(input[0]);                               //Convierto Double a int //También vale input[0].intValue();
        output[0][1] = (int)Math.round(input[0]);

        output[1][0] = (int)Math.floor(input[1]);
        output[1][1] = (int)Math.round(input[1]);

        output[2][0] = (int)Math.floor(input[2]);
        output[2][1] = (int)Math.round(input[2]);

        output[3][0] = (int)Math.floor(input[3]);
        output[3][1] = (int)Math.round(input[3]);

        output[4][0] = (int)Math.floor(input[4]);
        output[4][1] = (int)Math.round(input[4]);

        return output;
    }
}
