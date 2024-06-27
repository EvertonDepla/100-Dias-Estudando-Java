package edu.everton.dia50;

public class Fila<T> {
    private T[] elementos;
    private int tamanho;
    private int frente;
    private int tras;

    @SuppressWarnings("unchecked")
    public Fila(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
        frente = 0;
        tras = -1;
    }

    public boolean enfileirar(T elemento) {
        if (tamanho == elementos.length) {
            System.out.println("Fila cheia.");
            return false;
        }
        tras = (tras + 1) % elementos.length;
        elementos[tras] = elemento;
        tamanho++;
        return true;
    }

    public T desenfileirar() {
        if (tamanho == 0) {
            System.out.println("Fila vazia.");
            return null;
        }
        T elementoRemovido = elementos[frente];
        frente = (frente + 1) % elementos.length;
        tamanho--;
        return elementoRemovido;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}