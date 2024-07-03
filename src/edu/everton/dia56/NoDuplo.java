package edu.everton.dia56;

public class NoDuplo<T> {
    T dado;
    NoDuplo<T> proximo;
    NoDuplo<T> anterior;

    public NoDuplo(T dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
}