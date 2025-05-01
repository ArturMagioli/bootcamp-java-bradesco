package main.set.operacoesbasicas;

public class Convidado {
    //atributos
    private String nome;

    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }


    /*
     * código hash baseado no parâmetro de identificação codigoConvite
     * cria o código hash para a dispersão dos dados em buckets
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
        return result;
    }

    /*
     * verifica se dois objetos são iguais baseados no parâmetro de identificação
     * "Se dois objetos são "iguais" (equals retorna true), eles devem ter o mesmo hashCode()."
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " Convite: " + codigoConvite;
    }
}
