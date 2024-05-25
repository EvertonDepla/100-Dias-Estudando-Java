package edu.everton.dia18;

import javax.swing.*;

public class Swing {
    public static void main(String[] args) {
        
        int numero1, numero2, mod;
        double raiz1, raiz2;
        String mensagem = "";

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

        mod = numero1 % numero2;
        raiz1 = Math.sqrt(numero1);
        raiz2 = Math.sqrt(numero2);

        mensagem = mensagem + "resto de divisão de " + numero1 + " por " + numero2 + " = " + mod + "\n";
        mensagem = mensagem + "raiz quadrada de " + numero1 + " = " + raiz1 + "\n";
        mensagem = mensagem + "raiz quadrada de " + numero2 + " = " + raiz2 + "\n";
        JOptionPane.showMessageDialog(null, mensagem);

        System.exit(0);
    }
}
