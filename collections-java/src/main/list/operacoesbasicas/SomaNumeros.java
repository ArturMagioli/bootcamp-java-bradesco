package main.list.operacoesbasicas;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    
    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public Integer calcularSoma() {
        Integer soma = 0;
        for (Integer numero : numerosList) {
            soma += numero;
        }
        return soma;
    }

    public Integer encontrarMaiorNumero() {
        Integer maiorNumero = numerosList.getFirst();
        for (Integer numero : numerosList) 
            maiorNumero = numero > maiorNumero ? numero : maiorNumero;
        return maiorNumero;
    }

    public Integer encontrarMenorNumero() {
        Integer menorNumero = numerosList.getFirst();
        for (Integer numero : numerosList) 
            menorNumero = numero < menorNumero ? numero : menorNumero;
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(numerosList);
    }

    public static void main(String[] args) {
        SomaNumeros numerosList = new SomaNumeros();
        numerosList.adicionarNumero(5);
        numerosList.adicionarNumero(10);
        numerosList.adicionarNumero(15);

        numerosList.exibirNumeros();

        System.out.println(numerosList.encontrarMaiorNumero());
        System.out.println(numerosList.encontrarMenorNumero());
    }
}
