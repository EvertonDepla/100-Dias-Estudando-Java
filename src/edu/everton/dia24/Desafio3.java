package edu.everton.dia24;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        String nome;
        int N;

        for (int i = 0; i < C; i++) {
            nome = leitor.next();
            N = leitor.nextInt();
            if (nome.equals("Thor"))
                System.out.println("Y");
            else
                System.out.println("N");
        }
    }

}

/*
 * Entrada
 * Um número inteiro C será informado,
 * que será a quantidade de casos de teste.
 * Cada caso de teste inicia com uma palavra,
 * que é o primeiro nome de quem está tentando levantar o Mjölnir,
 * e um inteiro N (1 ≤ N ≤ 25000), indicando a força aplicada para cima,
 * em Newtons, ao puxar o martelo, de modo a tentar levantá-lo.
 * 
 * Saída
 * Para cada caso de teste imprima um caractere ‘Y’,
 * caso a pessoa tenha conseguido levantar , ou ‘N’, caso não tenha conseguido.
 */