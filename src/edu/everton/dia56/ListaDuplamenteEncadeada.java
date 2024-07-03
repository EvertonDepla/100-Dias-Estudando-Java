package edu.everton.dia56;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> cabeca;
    private NoDuplo<T> cauda;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public void adicionarNoInicio(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<>(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
        }
        tamanho++;
        System.out.println("Adicionado no início: " + dado);
    }

    public void adicionarNoFinal(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<>(dado);
        if (cauda == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
        }
        tamanho++;
        System.out.println("Adicionado no final: " + dado);
    }

    public T removerDoInicio() {
        if (cabeca == null) {
            System.out.println("Lista vazia.");
            return null;
        }
        T dado = cabeca.dado;
        if (cabeca == cauda) {
            cabeca = null;
            cauda = null;
        } else {
            cabeca = cabeca.proximo;
            cabeca.anterior = null;
        }
        tamanho--;
        System.out.println("Removido do início: " + dado);
        return dado;
    }

    public T removerDoFinal() {
        if (cauda == null) {
            System.out.println("Lista vazia.");
            return null;
        }
        T dado = cauda.dado;
        if (cabeca == cauda) {
            cabeca = null;
            cauda = null;
        } else {
            cauda = cauda.anterior;
            cauda.proximo = null;
        }
        tamanho--;
        System.out.println("Removido do final: " + dado);
        return dado;
    }

    public int obterTamanho() {
        return tamanho;
    }

    public void exibir() {
        if (cabeca == null) {
            System.out.println("Lista vazia.");
            return;
        }

        NoDuplo<T> atual = cabeca;
        while (atual != null) {
            System.out.print(atual.dado + " <-> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    public void exibirReverso() {
        if (cauda == null) {
            System.out.println("Lista vazia.");
            return;
        }

        NoDuplo<T> atual = cauda;
        while (atual != null) {
            System.out.print(atual.dado + " <-> ");
            atual = atual.anterior;
        }
        System.out.println("null");
    }
}