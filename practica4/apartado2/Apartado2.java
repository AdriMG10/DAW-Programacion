package org.ieslosremedios.daw1.prog.ut4.practica4.apartado2;

public class Apartado2 {
    public static void main(String[] args) {

        String texto = "Hola, me llamo Adri y estudio DAW en Ubrique.";
        String textoprueba = "Hola, me llamo Adri. Hola, me llamo Adri.";

        System.out.println("El número de palabras distintas es: " + contarNumPalabras(texto));
    }

    private static int contarNumPalabras(String texto) {

        texto = texto.toLowerCase();

        String[] stringTexto = texto.split(" ");
        String[] palabrasDistintas = new String[stringTexto.length];

        int contadorDistintas = 0;

        for (String palabra : stringTexto) {
            if (!arrayContieneCadena(palabrasDistintas, contadorDistintas, palabra)) {
                palabrasDistintas[contadorDistintas] = palabra;
                contadorDistintas++;
            }
        }
        return contadorDistintas;
    }

    private static boolean arrayContieneCadena(String[] array, int longitudActualArray, String cadena) {
        boolean encontrada = false;
        for (int i = 0; i < longitudActualArray; i++) {
            if (array[i].equals(cadena)) {
                encontrada = true;
                break;
            }
        }
        return encontrada;
    }
}

