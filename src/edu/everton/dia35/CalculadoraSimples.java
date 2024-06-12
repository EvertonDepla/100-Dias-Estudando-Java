package edu.everton.dia35;

public class CalculadoraSimples implements OperacaoMatematica {

    @Override
    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return numero1 / numero2;
    }

    public static void main(String[] args) {
        CalculadoraSimples calculadora = new CalculadoraSimples();

        try {
            double resultado1 = calculadora.dividir(10, 2);
            System.out.println("Resultado da divisão é: " + resultado1);

            // Tentativa de divisão por zero para demonstrar o tratamento de exceção
            double resultado2 = calculadora.dividir(10, 0);
            System.out.println("Resultado da divisão é: " + resultado2);
        } catch (ArithmeticException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
