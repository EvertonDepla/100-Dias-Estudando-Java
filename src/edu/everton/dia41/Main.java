package edu.everton.dia41;

public class Main {
    public static void main(String[] args) {
        Conta[] contas = new Conta[3];
        contas[0] = new ContaBancaria("Alice", 3000);
        contas[1] = new ContaCorrente("Bob", 2000, 500);
        contas[2] = new ContaPoupanca("Charlie", 1000, 0.01);

        for (Conta conta : contas) {
            conta.depositar(500);
            try {
                conta.sacar(1000);
            } catch (IllegalArgumentException e) {
                System.err.println("Erro: " + e.getMessage());
            }
            System.out.println(conta.getClass().getSimpleName() + " - Saldo: R$ " + conta.getSaldo());
        }

        ContaPoupanca contaPoupanca = (ContaPoupanca) contas[2];
        contaPoupanca.adicionarJuros();
        System.out.println("Saldo após adicionar juros: R$ " + contaPoupanca.getSaldo());
    }
}