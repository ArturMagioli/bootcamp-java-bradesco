package exercicios.ex003;

import exercicios.ex003.interfaces.FormasGeometrica;
import exercicios.ex003.entities.*;;

public class Main {
    
    public static void main(String[] args) {
        printarArea(new Quadrado(5));
        printarArea(new Circulo(7.2));
        printarArea(new Retangulo(2, 4.2));
    }
    

    public static void printarArea(FormasGeometrica forma) {
        System.out.println(forma.calcularArea());
    }
}
