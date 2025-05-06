package main.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

import main.set.pesquisa.agenda;

public class Age {
    //map trabalha com uma key e o tipo do valor que será referenciado
    //estrutura: chaves que referenciam valores
    //não herda a interface Iterable
    //esses valores podem ser repetidos
    //não pode conter chaves repetidas
    private Map<String, Integer> AgeMap; //Impossível o uso de primitivos nos generics

    public Age() {
        this.AgeMap = new HashMap<>();
    }

    /**
     * Observe que, nesse caso, não foi necessária uma classe para armazenar essa estrutura mais simples.
     * @param nome
     * @param telefone
     */
    public void adicionarContato(String nome, Integer telefone) {
        AgeMap.put(nome, telefone); //key, value
    }

    public void removerContato(String nome) {
        if(!AgeMap.isEmpty()) AgeMap.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(AgeMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!AgeMap.isEmpty()) numeroPorNome = AgeMap.get(nome);
        return numeroPorNome;
    }

    public static void main(String[] args) {
        Age Age = new Age();

        agenda.exibirContatos();

        agenda.adicionarContato("Artur", 40028922);
        agenda.adicionarContato("Artur", 0);
        agenda.adicionarContato("Artur de Paula", 1111111111);
        agenda.adicionarContato("Artur 212", 654987);
        agenda.adicionarContato("Maria Silva", 2222222);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Artur"));

        System.out.println("Contato atualizado: " + agenda.atualizarNumeroContato("Artur de Paula", 5));
    }
}
