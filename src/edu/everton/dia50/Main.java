package edu.everton.dia50;

public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>(5);

        // Enfileirando elementos
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(5);

        // Tentando enfileirar em uma fila cheia
        fila.enfileirar(6);

        // Desenfileirando elementos
        System.out.println("Desenfileirado: " + fila.desenfileirar());
        System.out.println("Desenfileirado: " + fila.desenfileirar());

        // Verificando se a fila está vazia
        System.out.println("Fila está vazia? " + fila.estaVazia());

        // Enfileirando mais elementos
        fila.enfileirar(6);
        fila.enfileirar(7);

        // Desenfileirando todos os elementos
        while (!fila.estaVazia()) {
            System.out.println("Desenfileirado: " + fila.desenfileirar());
        }

        // Verificando se a fila está vazia novamente
        System.out.println("Fila está vazia? " + fila.estaVazia());
    }
}