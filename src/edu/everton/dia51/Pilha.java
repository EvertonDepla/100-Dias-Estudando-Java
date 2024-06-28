package edu.everton.dia51;

public class Pilha<T> {
    private T[] elementos;
    private int topo;
    private int capacidade;

    @SuppressWarnings("unchecked")
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = (T[]) new Object[capacidade];
        this.topo = -1;
    }

    // Método para adicionar um elemento à pilha (empilhar)
    public void empilhar(T elemento) {
        if (topo == capacidade - 1) {
            System.out.println("Pilha cheia.");
        } else {
            elementos[++topo] = elemento;
            System.out.println("Empilhado: " + elemento);
        }
    }

    // Método para remover um elemento da pilha (desempilhar)
    public T desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia.");
            return null;
        }
        T elementoRemovido = elementos[topo--];
        System.out.println("Desempilhado: " + elementoRemovido);
        return elementoRemovido;
    }

    // Método para verificar se a pilha está vazia
    public boolean estaVazia() {
        return topo == -1;
    }

    // Método para obter o tamanho da pilha
    public int tamanho() {
        return topo + 1;
    }
}