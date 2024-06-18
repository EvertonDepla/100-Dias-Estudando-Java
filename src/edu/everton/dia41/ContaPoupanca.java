package edu.everton.dia41;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String titular, double saldoInicial, double taxaJuros) {
        super(titular, saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    public void adicionarJuros() {
        double juros = getSaldo() * taxaJuros;
        depositar(juros);
        System.out.println("Juros de R$ " + juros + " adicionados à conta poupança de " + getTitular());
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}