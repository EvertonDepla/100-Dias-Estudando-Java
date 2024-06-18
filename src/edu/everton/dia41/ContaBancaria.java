package edu.everton.dia41;

public class ContaBancaria implements Conta {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado para " + titular);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void sacar(double valor) throws IllegalArgumentException {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado por " + titular);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente ou valor inválido.");
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}