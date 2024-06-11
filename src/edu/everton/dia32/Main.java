package edu.everton.dia32;

public class Main {
    public static void main(String[] args) {
        Cliente everton = new Cliente();
        everton.setNome("Everton");

        Conta cc = new ContaCorrente(everton);
        Conta poupança = new ContaPoupança(everton);
        
        cc.depositar(100);
        cc.transferir(100, poupança);

        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }
}
