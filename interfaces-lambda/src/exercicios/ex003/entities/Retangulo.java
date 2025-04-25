package exercicios.ex003.entities;

import exercicios.ex003.interfaces.FormasGeometrica;

public class Retangulo implements FormasGeometrica {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
