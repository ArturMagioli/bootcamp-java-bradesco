package encapsulamento;

import heranca.FacebookMessenger;
import heranca.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messeger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
