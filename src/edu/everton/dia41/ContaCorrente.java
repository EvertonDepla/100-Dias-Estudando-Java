package edu.everton.dia41;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, double saldoInicial, double limiteChequeEspecial) {
        super(titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) throws IllegalArgumentException {
        if (valor > 0 && valor <= (getSaldo() + limiteChequeEspecial)) {
            double saldoAtual = getSaldo();
            if (valor > saldoAtual) {
                double valorUsadoChequeEspecial = valor - saldoAtual;
                super.sacar(saldoAtual);
                limiteChequeEspecial -= valorUsadoChequeEspecial;
                System.out.println("Usado R$ " + valorUsadoChequeEspecial + " do cheque especial.");
            } else {
                super.sacar(valor);
            }
        } else {
            throw new IllegalArgumentException("Saldo insuficiente ou valor inválido.");
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}