package org.ieslosremedios.daw1.prog.ut4.practica4.apartado1;

public class Cuadrado extends Geometria implements Coloreable {

    private double lado;
    String color;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    double calcularArea() {
        return Math.pow(lado, 2);
    }

    double calcularPerimetro() {
        return lado * 4;
    }
}
