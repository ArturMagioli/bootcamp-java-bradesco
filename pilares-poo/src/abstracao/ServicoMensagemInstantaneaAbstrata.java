package abstracao;

public abstract class ServicoMensagemInstantaneaAbstrata {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();


    /**
     * Funcionalidade comum a todos os filhos e implementado de modo igual.
     * Nada impede de conter herança em uma classe abstrata!
     * Note que classes abstratas podem conter atributos e métodos não abstratos
     */
    protected void validarConectadoInternet() {
        System.out.println("Validando se esta conectado a internet");
    }
}
