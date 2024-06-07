package edu.everton.dia30;

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[3];
        formas[0] = new Circulo(5);
        formas[1] = new Retangulo(4, 6);
        formas[2] = new Circulo(3);

        for (Forma forma : formas) {
            System.out.println("A área da forma é: " + forma.calcularArea());
        }
    }
}