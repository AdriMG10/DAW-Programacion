package org.ieslosremedios.daw1.prog.ut5.practica5;

public class Main {
    public static void main(String[] args) {

        System.out.println("TEST COLA");

        System.out.print("1. Creo cola: ");
        Cola cola = new Cola();
        System.out.println(cola);

        System.out.print("2. Añado elementos: ");
        cola.encolar("Pajuelo");
        cola.encolar("Adri");
        cola.encolar("Alvarito");
        cola.encolar("Victor");
        System.out.println(cola);

        System.out.print("3. Elimino elemento: ");
        cola.desencolar();
        System.out.println(cola);

        System.out.print("4. Devuelvo primer elemento: ");
        cola.frente();

        System.out.print("5. Devuelvo el resto de elementos: ");
        cola.resto();
        System.out.println();

        System.out.print("6. Vacio todos los elementos: ");
        cola.limpiar();
        System.out.println(cola);

        System.out.println("7. La cola está vacía: " + cola.esVacia());

        System.out.print("8. La longitud de la cola es: ");
        cola.longitud();
        System.out.println("\n");


        System.out.println("TEST PILA");

        System.out.print("1. Creo pila: ");
        Pila pila = new Pila();
        System.out.println(pila);

        System.out.print("2. Apilo elementos: ");
        pila.apilar("lego 2x8");
        pila.apilar("lego 2x6");
        pila.apilar("lego 2x4");
        pila.apilar("lego 2x2");
        System.out.println(pila);

        System.out.print("3. Desapilo elemento: ");
        pila.desapilar();
        System.out.println(pila);

        System.out.print("4. Devuelvo elemento en la cima: ");
        pila.cima();

        System.out.print("5. Vacio todos los elementos: ");
        pila.limpiar();
        System.out.println(pila);

        System.out.println("6. La pila está vacía: " + pila.esVacia());

        System.out.print("7. La longitud de la pila es: ");
        pila.longitud();
    }
}
