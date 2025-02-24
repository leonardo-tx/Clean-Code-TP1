package org.example.ex1;

public abstract class Conta {
    private double saldo;

    protected Conta (double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor de saque não pode ser negativo.");
        }
        saldo -= valor;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return "Conta: " + getName() + " - Saldo: " + getSaldo();
    }
}
