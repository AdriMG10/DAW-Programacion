package org.ieslosremedios.daw1.prog.ut3.actividad35;

public class Bird extends Animal implements Flyable {

    @Override
    public void speak() {
        System.out.println("PIO PIO");
    }

    @Override
    public void fly() {
        System.out.println("Vuelo");
    }
}
