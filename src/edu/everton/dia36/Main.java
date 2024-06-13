package edu.everton.dia36;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(120); // Limite de velocidade é 120 km/h

        System.out.println("Velocidade inicial: " + meuCarro.getVelocidade() + " km/h");

        try {
            meuCarro.acelerar(50);
            meuCarro.acelerar(70);
            meuCarro.acelerar(10); // Tentativa de ultrapassar o limite de velocidade
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        System.out.println("Velocidade final: " + meuCarro.getVelocidade() + " km/h");
    }
}