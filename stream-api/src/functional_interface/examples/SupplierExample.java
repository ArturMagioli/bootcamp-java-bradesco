package functional_interface.examples;

import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.List;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada.
        //Lembre-se: É o equivalente de escrever instanciar uma classe anônima e implementar o método abstrato da interface funcional.
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)";

        // Usar o Supplier para obter uma lista com 5 saudações. Depois converte para uma lista 
        List<String> listaSaudacoes = Stream.generate(saudacao)
            .limit(5)
            .toList();

        //passando a expressão lambda diretamente:
        List<String> listaSaudacoes2 = Stream.generate(() -> "Aloha")
            .limit(5)
            .toList();

            // Imprimir as saudações geradas
            listaSaudacoes.forEach(s -> System.out.println(s));

            //com method reference:
            listaSaudacoes2.forEach(System.out::println);

        /**
         * OBSERVAÇÃO: Consumer opera sobre collections, por isso necessita do método stream() para que seja implementado
         * Enquanto isso, Supplier gera dados, sendo implementado por um método estático da classe Stream
         */
    }
}
