package main.map.ordenacao;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collection;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.Month;
import java.util.Set;

public class AgendaEventos {
    
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() { this.eventosMap = new HashMap<>(); }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    //Para ordenação: TreeMap
    public void exibirAgenda() {
        //por que isso funciona: 
        /*
         * Como não passamos nenhum comparator, será utilizado um comparable da classe
         * TreeMap organiza pela chave. A chave é do tipo LocalDate, que implementa ChronoLocalDate, que implemeta um Comparable 
         */
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        //não útil por não entregar os dados de modo relacionado
        // Set<LocalDate> dateSet = eventosMap.keySet();
        // Collection<Evento> values = eventosMap.values();
        // eventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        //organizando o map na ordem crescente:
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        //entrySet() retorna um Set de Entry's. Estruturas que conseguem relacionar uma chave e seu respectivo valor.
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data" + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 06), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 7, 9), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atracao 3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
