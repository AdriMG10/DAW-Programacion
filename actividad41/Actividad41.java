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
        System.out.println(a[2]);
        System.out.println(a[4]);
        m(a);
        System.out.println("Después del método:");
        System.out.println(a[0]);
        System.out.println(a[2]);
        System.out.println(a[4]);
    }

    public static void m (int x) {
        x += 1;
    }

    public static void m (int x, String s) {
        s = s.toUpperCase();
    }

    public static void m (Double[] a) {
        a[0] += 1;
        a[2] += 1;
        a[4] += 1;
    }

    //final int M = 2;
    //public static int[][] m2 (Double[] a, int M) {}
    //No sé hacer más del 7
}
