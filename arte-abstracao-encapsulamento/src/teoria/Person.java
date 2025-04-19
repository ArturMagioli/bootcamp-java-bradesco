package teoria;
/**
 * <h3> Records </h3>
 * <ul>
 * 
 *  <li>Atributos no corpo de um record devem ser estáticos</li>
 *  <li>Os valores dentro de um Record nunca são alterados. É somente para a leitura</li>
 *  <li>Caso queira alocar atributos de instância, o construtor de um record é na própria declaração -> <b>necessária a atribuição de valores</b></li>
 *  <li>toString possui uma estrutura mais adequada que o toString de uma classe</li>
 * </ul>
 */
public record Person(String nomeNaoEstatico, int idade) {
    //public static String nomeEstatico;

    /**
     * Os construtores compactos dentro de um record são, na verdade, métodos que seão executados antes do verdadeiro construtor.
     * Pode-se utilizá-los para validação de valores e etc.
     * Não é possível nem passar parâmetros
     */
    public Person {
        System.out.println("Iniciando validação... finalizado!");
    }

    /**
     * Caso queira aplicar sobrecarga, você ainda é obrigado a chamar o construtor padrão do Record:
     */ 
    public Person(String name) {
        this(name, 20);
    }

    public String getInfo() {
        return "Nome: " + nomeNaoEstatico + " idade: " + idade;
    }
}
