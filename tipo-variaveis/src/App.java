public class App {
    public static void main(String[] args) throws Exception {
        //Escrita de números padrão:
        double salarioMinimo = 2500;

        //Linguagem fortemente tipada: 
        short numeroCurto = 1;
        int numeroNormal = numeroCurto; //funciona
        numeroCurto = (short) numeroNormal; //Erro. Necessita de uma casting (short)

        //variaveis vs constantes:

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI);
    }
}
