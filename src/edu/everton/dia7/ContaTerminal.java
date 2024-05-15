package edu.everton.dia7;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o número da conta");
            int numero = scanner.nextInt();

            System.out.println("Digite o numero da sua agência");
            int agencia = scanner.nextInt();
            
            System.out.println("Digite seu nome");
            String nomeCliente = scanner.next();

            System.out.println("Digite seu saldo");
            double saldo = scanner.nextDouble();
    
            System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
            ;
        }
    }
