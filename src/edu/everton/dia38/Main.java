package edu.everton.dia38;

public class Main {
    public static void main(String[] args) {
        Computador meuComputador = new Computador();

        try {
            meuComputador.ligar();
            meuComputador.ligar(); // Tentativa de ligar o computador já ligado
        } catch (IllegalStateException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        try {
            meuComputador.desligar();
            meuComputador.desligar(); // Tentativa de desligar o computador já desligado
        } catch (IllegalStateException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        System.out.println("Status do computador: " + (meuComputador.isLigado() ? "Ligado" : "Desligado"));
    }
}