package org.ieslosremedios.daw1.prog.ut3.actividad35;

public class MainAnimal {
    public static void main(String[] args) {

        Animal a;

        a = new Lion();
        a.speak();

        a = new Bird();
        a.speak();
        ((Bird)a).fly();
    }
}