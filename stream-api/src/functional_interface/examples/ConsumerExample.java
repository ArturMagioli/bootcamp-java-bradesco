package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar o valor
 */
public class ConsumerExample {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir números pares
        //É como criar uma classe anônima que implementa uma interface funcional
        //É possível simplificar isso sem a necessidade de 'armazenar a função'
        // Consumer<Integer> imprimirNumeroPar = numero -> {
        //     if (numero % 2 == 0) System.out.println(numero);
        // };

        // Usar o Consumer para imprimir números pares no Stream
        // numeros.stream().forEach(imprimirNumeroPar);

        //Implementando um modo mais simplificado: classes anônimas
        //Basicamente, um consumer consome cada elemento de uma collection através do método abstrato (accept) da interface funcional
        // numeros.stream().forEach(new Consumer<Integer>() {
            
        //     @Override
        //     public void accept(Integer numero) {
        //         if (numero % 2 == 0) {
        //             System.out.println(numero);
        //         }
        //     }
        // });


        //Implementando ainda mais simples: lambda. stream() também pode ser oculto
        numeros.forEach(numero -> {
            if (numero % 2 == 0) System.out.println(numero);
        });
    }
}
