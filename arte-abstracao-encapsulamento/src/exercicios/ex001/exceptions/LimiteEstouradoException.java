package exercicios.ex001.exceptions;

public class LimiteEstouradoException extends RuntimeException{
      /**
     * importante caso a exceção seja serializada
     */
    private static final long serialVersionUID = 1149241039409861914L;

    // constrói um objeto NumeroNegativoException com a mensagem passada por parâmetro
    public LimiteEstouradoException(String msg){
        super(msg);
    }
}
