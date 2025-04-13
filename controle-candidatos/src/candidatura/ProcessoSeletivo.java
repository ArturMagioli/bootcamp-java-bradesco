package candidatura;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.synth.SynthToolBarUI;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        
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
