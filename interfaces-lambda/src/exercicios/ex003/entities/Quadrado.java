package exercicios.ex003.entities;

import exercicios.ex003.interfaces.FormasGeometrica;

public class Quadrado implements FormasGeometrica {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }

}
