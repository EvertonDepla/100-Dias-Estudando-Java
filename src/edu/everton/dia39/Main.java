package edu.everton.dia39;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Empregado("Alice", 3000);
        funcionarios[1] = new Gerente("Everton", 5000, 2000);
        funcionarios[2] = new Estagiario("Paulo", 1500);

        for (Funcionario f : funcionarios) {
            f.trabalhar();
            System.out.println(f.getClass().getSimpleName() + " - Salário: R$ " + f.calcularSalario());
        }
    }
}