package main.list.operacoesbasicas;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Item> compras = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        compras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> comprasParaEliminar = new ArrayList<>();
        for (Item i : compras) {
            if (i.getNome().equalsIgnoreCase(nome))
                comprasParaEliminar.add(i);
        }
        compras.removeAll(comprasParaEliminar);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item i : compras) {
            valorTotal += i.getPreco();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(compras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Cafe", 400, 1);
        carrinho.adicionarItem("Arroz", 245, 2);

        System.out.println("Preco do carrinho: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Cafe");
        
        carrinho.exibirItens();
    }
}
