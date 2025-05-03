package main.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        //Não é possível aplicar a estrutura HashSet. Usa-se TreeSet. Nesse caso, ele possui um método de ordenação Comparable a partir da instanciação (o que implementamos).
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        //Para Set, podemos passar como 'argumento da interface' uma instância de um comparator para devida organização automática
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    /**
     * Ou seja, passando no TreeSet:
     * a instância de um Set -> aplica o Comparable, caso tenha
     * a instância de um Comparator -> aplica o Comparator.
     * @param args
     */

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 150, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 204, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 104, 2);
        cadastroProdutos.adicionarProduto(2L, "Produto 9", 20, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
