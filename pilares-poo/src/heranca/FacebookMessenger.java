package heranca;

import abstracao.ServicoMensagemInstantaneaAbstrata;

public class FacebookMessenger extends ServicoMensagemInstantaneaAbstrata{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    
    private void salvarHistoricoMensagem() {
        System.out.println("Salvanco o histórico da mensagem");
    }
}
