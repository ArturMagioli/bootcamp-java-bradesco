package main.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //map trabalha com uma key e o tipo do valor que será referenciado
    //estrutura: chaves que referenciam valores
    //não herda a interface Iterable
    //esses valores podem ser repetidos
    //não pode conter chaves repetidas
    private Map<String, Integer> AgMap; //Impossível o uso de primitivos nos generics

    public AgendaContatos() {
        this.AgMap = new HashMap<>();
    }

    /**
     * Observe que, nesse caso, não foi necessária uma classe para armazenar essa estrutura mais simples.
     * O método put INSERE E ATUALIZA
     * @param nome
     * @param telefone
     */
    public void adicionarContato(String nome, Integer telefone) {
        AgMap.put(nome, telefone); //key, value
    }

    public void removerContato(String nome) {
        if(!AgMap.isEmpty()) AgMap.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(AgMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!AgMap.isEmpty()) numeroPorNome = AgMap.get(nome);
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        //Quando uma chave se repete, ao contrário da Set, Map irá atribuir um novo valor em uma chave existente.
        //Temos uma ordem aleatória de valores
        agendaContatos.adicionarContato("Artur", 40028922);
        agendaContatos.adicionarContato("Artur", 77);
        agendaContatos.adicionarContato("Artur de Paula", 1111111111);
        agendaContatos.adicionarContato("Artur 212", 654987);
        agendaContatos.adicionarContato("Maria Silva", 2222222);

        agendaContatos.removerContato("Artur de Paula");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Artur"));

    }
}
