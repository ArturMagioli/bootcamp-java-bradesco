public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCepString("1234568");
        }catch(CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negócio: " + e);
        }
    }

    static String formatarCepString(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

            //simulando um cep formatado
            return "21.765-864";
    }
}
