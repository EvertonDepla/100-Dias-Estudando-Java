package edu.everton.dia39;

public class Estagiario extends Empregado {
    private static final double REDUCAO = 0.5;

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase * REDUCAO);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
}