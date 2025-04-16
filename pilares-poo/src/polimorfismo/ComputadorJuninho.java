package polimorfismo;

import abstracao.ServicoMensagemInstantaneaAbstrata;
import encapsulamento.MSNMessenger;
import heranca.FacebookMessenger;
import heranca.Telegram;

public class ComputadorJuninho {
    public static void main(String[] args) {
        ServicoMensagemInstantaneaAbstrata smi = null;
        /*
         * NÃO SE SABE QUAL APP
         * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */

         String appEscolhido = "tlg";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
