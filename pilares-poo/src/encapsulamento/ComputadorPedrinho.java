package encapsulamento;

import encapsulamento.MSNMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messeger
        MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();

        msn.receberMensagem();
    }
}
