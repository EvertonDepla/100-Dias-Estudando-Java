package edu.everton.dia86;

public class Main {
        public static void main(String[] args) {
            // Implementação da interface funcional usando expressões lambda
            Calculadora adicao = (a, b) -> a + b;
            Calculadora subtracao = (a, b) -> a - b;
            Calculadora multiplicacao = (a, b) -> a * b;
            Calculadora divisao = (a, b) -> {
                if (b == 0) {
                    throw new ArithmeticException("Divisão por zero");
                }
                return a / b;
            };
    
            // Utilizando as implementações da interface funcional
            System.out.println("Adição: " + adicao.calcular(10, 5));
            System.out.println("Subtração: " + subtracao.calcular(10, 5));
            System.out.println("Multiplicação: " + multiplicacao.calcular(10, 5));
            System.out.println("Divisão: " + divisao.calcular(10, 5));
        }
    } 