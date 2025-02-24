package org.example.ex7;

public class ContaBancaria {
    private final String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor de depósito não pode ser negativo");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor de saque não pode ser negativo");
        }
        if (valor > this.saldo) {
            throw new IllegalArgumentException("O valor subtraído não pode ser maior que o saldo");
        }
        this.saldo -= valor;
    }
}