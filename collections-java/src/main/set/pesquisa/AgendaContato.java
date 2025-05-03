package main.set.pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContato {
    
    private Set<Contato> contatoSet;

    public AgendaContato() {
        contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContatos();

        agendaContato.adicionarContato("Artur", 40028922);
        agendaContato.adicionarContato("Artur", 0);
        agendaContato.adicionarContato("Artur de Paula", 1111111111);
        agendaContato.adicionarContato("Artur 212", 654987);
        agendaContato.adicionarContato("Maria Silva", 2222222);

        agendaContato.exibirContatos();

        System.out.println(agendaContato.pesquisarPorNome("Artur"));

        System.out.println("Contato atualizado: " + agendaContato.atualizarNumeroContato("Artur de Paula", 5));
    }
}
