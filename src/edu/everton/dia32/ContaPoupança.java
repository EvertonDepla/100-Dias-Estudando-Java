package edu.everton.dia32;
public class ContaPoupança extends Conta {
    
    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
