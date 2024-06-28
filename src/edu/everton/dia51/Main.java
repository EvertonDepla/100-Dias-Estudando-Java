package edu.everton.dia51;

public class Main {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(5);

        // Empilhando elementos
        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(4);
        pilha.empilhar(5);

        // Tentando empilhar em uma pilha cheia
        pilha.empilhar(6);

        // Desempilhando elementos
        pilha.desempilhar();
        pilha.desempilhar();

        // Verificando se a pilha está vazia
        System.out.println("Pilha está vazia? " + pilha.estaVazia());

        // Empilhando mais elementos
        pilha.empilhar(6);
        pilha.empilhar(7);

        // Desempilhando todos os elementos
        while (!pilha.estaVazia()) {
            pilha.desempilhar();
        }

        // Verificando se a pilha está vazia novamente
        System.out.println("Pilha está vazia? " + pilha.estaVazia());
    }
}