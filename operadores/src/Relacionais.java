public class Relacionais {
    public static void main (String [] args) {
        int numero = 1;
        int numero2 = 2;

        boolean simNao = numero == numero2;

        System.out.println("numeroUm é igual à numeroDois?: " + simNao);

        simNao = numero != numero2;

        System.out.println("numeroUm é diferente do numeroDois?: " + simNao);

        if(simNao = numero > numero2)
            System.out.println("numeroUm é maior à numeroDois?: " + simNao);
        else
            System.out.println("numeroUm é menor que numeroDois?: " + simNao);

        //comparando strings

        String nomeUm = "GLEYSON";
        String nomeDois = "GLEYSON";
        String nomeTres = new String("GLEYSON"); //veio de uma estrutura difente. retorna falso se comparado com os demais
        System.out.println(nomeUm == nomeTres);
        //forma correta de se comparar estruturas:
        System.out.println(nomeTres.equals(nomeUm));
    }
}
