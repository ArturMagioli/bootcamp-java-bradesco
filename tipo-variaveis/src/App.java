public class App {
    public static void main(String[] args) throws Exception {
        //Escrita de números padrão:
        double salarioMinimo = 2500;

        //Linguagem fortemente tipada: 
        short numeroCurto = 1;
        int numeroNormal = numeroCurto; //funciona
        numeroCurto = (short) numeroNormal; //Erro. Necessita de uma casting (short)
    }
}
