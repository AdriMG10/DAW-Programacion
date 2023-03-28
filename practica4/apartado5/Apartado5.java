package org.ieslosremedios.daw1.prog.ut4.practica4.apartado5;

public class Apartado5 {
    public static void main(String[] args) {

        String texto = "Buenos días Buenos días Buenos días Buenos días Buenos días";
        String palabra = "días";

        int numOcurrencias = buscarPalabra(texto, palabra);

        System.out.println("La palabra '" + palabra + "' aparece " + numOcurrencias + " veces en el texto.");
    }

    public static int buscarPalabra(String texto, String palabra) {

        int contador = 0;

        String[] palabras = texto.split(" ");

        for (String xPalabra : palabras) {
            if (xPalabra.equals(palabra)) {
                contador++;
            }
        }
        return contador;
    }
}

