package main.list.ordenacao;

public class Pessoa implements Comparable<Pessoa>{
    
    private String nome;

    private int idade;

    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    /**
     * ordenacao por Comparable: essa interface altera a classe.
     * O seu generics, nesse contexto,s transforma o argumento passado de 'object o' para 'Pessoa 0'
    */
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
}
