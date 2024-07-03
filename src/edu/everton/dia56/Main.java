package edu.everton.dia56;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();

        lista.adicionarNoInicio(1);
        lista.adicionarNoInicio(2);
        lista.adicionarNoFinal(3);
        lista.adicionarNoFinal(4);

        System.out.println("Lista após adições:");
        lista.exibir();

        lista.removerDoInicio();
        lista.removerDoFinal();

        System.out.println(" remoção da lista:");
        lista.exibir();

        lista.adicionarNoInicio(5);
        lista.adicionarNoFinal(6);

        System.out.println("Lista final:");
        lista.exibir();

        System.out.println("Lista em ordem reversa:");
        lista.exibirReverso();

        System.out.println("Tamanho da lista: " + lista.obterTamanho());
    }
}
