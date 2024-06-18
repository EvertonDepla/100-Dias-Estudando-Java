package edu.everton.dia41;

public interface Conta {
    void depositar(double valor);
    void sacar(double valor) throws IllegalArgumentException;
    double getSaldo();
}