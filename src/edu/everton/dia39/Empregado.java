package edu.everton.dia39;

public class Empregado implements Funcionario {
    private String nome;
    private double salarioBase;

    public Empregado(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}