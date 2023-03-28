package org.ieslosremedios.daw1.prog.ut4.strings.actividad46;

import java.util.Arrays;

public class Actividad46 {
    public static void main(String[] args) {

        String s = "¡Hola, buenos días!";
        int[] numbers = {2, 1, 11, 10};
        String[] strings;

        int posicion = 5;
        String s2 = "PlayStation";
        char caracter = 'a';

        System.out.println("Apartado 1:");
        System.out.println("La longitud de la cadena '" + s + "' es: " + imprimeLongitudCadena(s) + "\n");
        System.out.println("Apartado 2:");
        System.out.println("El caracter que está en la posición " + posicion + " de " + s2 + " es: " + caracterEnPosicionEmpezandoEn1(s2, posicion) + "'\n");
        System.out.println("Apartado 3:");
        System.out.println("El carácter '" + caracter + "' aparece " + cuentaOcurrenciasCaracter(s, caracter) + " veces en: '" + s + "'\n");

        System.out.println("Apartado 5:");
        System.out.println(Arrays.toString(cadenaCodificada("Hola, me llamo Fererico, tengo 45 años y vivo en Francia")) + "'\n");
        System.out.println("Apartado 6:");
        System.out.println("Convierto el array a String y ordeno alfabéticamente: " + Arrays.toString(convertirAStringYOrdenar(numbers)) + "'\n");
    }

    //TODO: imprimeLongitudCadena
    private static int imprimeLongitudCadena (String cadena) {

        int longitudCadena = cadena.length();

        return longitudCadena;
    }

    //TODO: caracterEnPosicionEmpezandoEn1 dada la posición devolver el caracter que ocupa esa posición contando desde 1
    private static char caracterEnPosicionEmpezandoEn1 (String string, int posicion) {

        char caracter = 0;

        if (posicion <= string.length() && posicion >= 0) {
            caracter = string.charAt(posicion - 1);
        }
        else
            System.out.println("Posición no valida");

        return caracter;
    }

    //TODO: cuentaOcurrenciasDeUnCaracter
    private static int cuentaOcurrenciasCaracter(String cadena, char caracter) {

        int caracteresTotales = 0;

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == caracter)
                caracteresTotales++;
        }
        return caracteresTotales;
    }

    //TODO: imprimeCadenasEnOrdenAlfabetico imprime en orden alfabético las cadenas dadas por un array de cadenas,
    // sin tener en cuenta si son mayúsculas o minúsculas

    //TODO: un método que dado un pequeño texto devuelva un array de cadenas codificando el texto, de modo que:
    // - todas las vocales se sustituyen por un número: o --> 0, i --> 1, a --> 4, e --> 3, salvo la u que se cambia por
    // - cada vez que aparezca el caracter punto (.) se corte esa frase y se meta en una posición del array.
    // - la frase que se mete en cada posición del array tiene que estar sin espacios al principio ni al final.
    private static String[] cadenaCodificada(String cadena) {

        System.out.print("Antes de codificarlo: ");
        System.out.println(cadena);
        System.out.print("Después de codificarlo: ");

        String cadenaVocales = cadena.replaceAll("[Aa]", "4")
                .replaceAll("[Ee]", "3")
                .replaceAll("[Ii]", "1")
                .replaceAll("[Oo]", "0")
                .replaceAll("[Uu]", "V");

        String[] arrayCadena = cadenaVocales.split("\\.");

        String cadenavocales = cadenaVocales.trim();

        return arrayCadena;
    }

    //TODO: convertir los siguientes números a String y posteriormente ordenarlos alfabéticamente de menor a mayor
    private static String[] convertirAStringYOrdenar(int[] numbers) {

        String[] strings = new String[numbers.length];

        //Conversión
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        //Ordenación
        Arrays.sort(strings);

        return strings;
    }
}
