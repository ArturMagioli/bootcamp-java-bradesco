public class Incrementos {
    public static void main (String [] args) {
        int numero = 5;

        //x repeticao
        numero = numero + 1;
        numero++;
        numero += 1;

        System.out.println(numero);

        // numero++ vs ++numero:

        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero);
        // obs:decrementos seguem a mesma lógica, bem como os demais operadores básicos...

        // booleanos

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel); //false
    }
}
