package main.map.pesquisa;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade ) {
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0.0;
        if (!estoqueProdutos.isEmpty())
            //values retorna uma collection com os... valores do map.
            for(Produto p: estoqueProdutos.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutos.isEmpty())
            for (Produto p: estoqueProdutos.values())
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 5.0, 10);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 10.0, 5);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 15.0, 2);
        estoqueProdutos.adicionarProduto(4L, "Produto D", 20, 2);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro().getNome());
    }
}
