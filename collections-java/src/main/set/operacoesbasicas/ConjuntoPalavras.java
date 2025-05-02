package main.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavras {
    private Set<Palavra> palavrasSet;

    public ConjuntoPalavras() {
        palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(new Palavra(palavra));
    }
    
    public void removerPalavra(String palavra) {
        Palavra palavraParaRemover = null;
        for (Palavra p : palavrasSet) {
            if(p.getPalavra().equalsIgnoreCase(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }
        palavrasSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(new Palavra(palavra));
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }

    /*
     * obs: nota-se a importância de hashCode para as funções adicionarPalavra e verificarPalavra (contains)
     */
    public static void main(String[] args) {
        ConjuntoPalavras conjuntoPalavras = new ConjuntoPalavras();

        conjuntoPalavras.adicionarPalavra("popo");
        conjuntoPalavras.adicionarPalavra("no");
        conjuntoPalavras.adicionarPalavra("tocou");
        conjuntoPalavras.adicionarPalavra("ele");
        conjuntoPalavras.adicionarPalavra("ele");

        System.out.println(conjuntoPalavras.verificarPalavra("popo"));
        conjuntoPalavras.exibirPalavrasUnicas();
    }
}
