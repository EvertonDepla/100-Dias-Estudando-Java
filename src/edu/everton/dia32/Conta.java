package edu.everton.dia32;

public abstract class Conta implements IConta {
    
    private int agencia;
    private int numero;
    private double saldo;

    public void sacar(double valor){

    }

    public void depositar(double valor) {

    }

    public void transferir(double valor, Conta contaDestino) {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
