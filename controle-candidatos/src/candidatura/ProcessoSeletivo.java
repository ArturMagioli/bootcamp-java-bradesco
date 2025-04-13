package candidatura;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.synth.SynthToolBarUI;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual++];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }
        } 
    }

    /**
     * Gera um valor aleatório de forma adequada para um ambiente multi thread.
     * <ul>
     *  <li><b>ThreadLocalRandom</b>: classe para lidar com a thread atual;</li>
     *  <li><b>current()</b>: método para recuperar a instância da thread atual;</li>
     *  <li><b>nextDouble()</b>: o método para gerar um double aleatório.</li>
     * </ul>
     * @return double
     */
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
