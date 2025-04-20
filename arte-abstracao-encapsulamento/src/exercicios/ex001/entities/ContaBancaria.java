package exercicios.ex001.entities;

import exercicios.ex001.exceptions.LimiteEstouradoException;

public class ContaBancaria {
    private double saldo;
    private final double CHEQUE_ESPECIAL;
    private double chequeEspecialUsado;
    private double taxa;
    private double limite;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;

        if (saldo <= 500)
            this.CHEQUE_ESPECIAL = 50.0;
        else
            this.CHEQUE_ESPECIAL = 0.5 * getSaldo();

        this.chequeEspecialUsado = 0.0;

        this.taxa = atualizarTaxa(0);
        atualizarLimite();
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        atualizarLimite();
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getChequeEspecial() {
        return this.CHEQUE_ESPECIAL;
    }

    public double getChequeEspecialUsado() {
        return this.chequeEspecialUsado;
    }

    public void setChequeEspecialUsado(double chequeEspecialUsado) {
        this.chequeEspecialUsado = chequeEspecialUsado;
        setTaxa(atualizarTaxa(this.chequeEspecialUsado + this.getTaxa()));
    }

    public double getTaxa() {
        return this.taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void depositarDinheiro(double deposito) {
        setSaldo(getSaldo() + deposito);
    }

    private void atualizarLimite() {
        setLimite(this.saldo + this.CHEQUE_ESPECIAL);
    }

    private double atualizarTaxa(double quantia) {
        return 0.2 * this.chequeEspecialUsado;
    }

    public double sacarDinheiro(double quantia) throws LimiteEstouradoException {
        if (saldo + chequeEspecialUsado > limite) {
            throw new LimiteEstouradoException("O limite da sua conta Bancária estourou.");
        }

        if (quantia > limite) {
            throw new LimiteEstouradoException("O valor é muito grande para o seu saldo atual");
        }

        if (quantia <= saldo) {
            setSaldo(getSaldo() - quantia);
        }else {
            if (this.chequeEspecialUsado > this.CHEQUE_ESPECIAL)
                throw new LimiteEstouradoException("Não há cheque especial disponível");
            double resto = quantia - this.saldo;
            setSaldo(0);
            setChequeEspecialUsado(getChequeEspecialUsado() + resto);
        }

        atualizarLimite();
        return quantia;
    }

    public void pagarBoleto(double quantia) {
       System.out.println("Boleto pago: " + sacarDinheiro(quantia)); 
    }

    public boolean cobrarTaxa() {
        if (this.saldo >= this.taxa ) {
            pagarBoleto(this.taxa);
            setChequeEspecialUsado(0);
            setTaxa(0);
            return true;
        }
        return false;
    }
}
