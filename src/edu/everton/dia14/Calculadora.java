package edu.everton.dia14;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
       
        int numero1, numero2;
        double quociente;
        double potencia;
        String resultadoQuociente, resultadoPotencia;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        numero2 = scanner.nextInt();

        if (numero2 != 0) {
            quociente = (double) numero1 / numero2;
            resultadoQuociente = "O quociente da divisão de " + numero1 + " por " + numero2 + " é: " + quociente;
        } else {
            resultadoQuociente = "Divisão por zero não é permitida.";
        }

        potencia = Math.pow(numero1, numero2);
        resultadoPotencia = "A potência de " + numero1 + " elevado a " + numero2 + " é: " + potencia;

        System.out.println(resultadoQuociente);
        System.out.println(resultadoPotencia);

        scanner.close();
    }
}
