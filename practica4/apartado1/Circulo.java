package org.ieslosremedios.daw1.prog.ut4.practica4.apartado1;

public class Circulo extends Geometria implements Coloreable {

    private double radio;
    String color;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    @Override
    double calcularArea() {
        double area = Math.PI * (radio * radio);
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = Math.PI * (radio * 2);
        return perimetro;
    }
}
