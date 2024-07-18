package edu.everton.dia71;

import java.util.*;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>(Arrays.asList(
            new Pessoa("Alice", 30),
            new Pessoa("Everton", 25),
            new Pessoa("Carlos", 35)
        ));

        // Ordenando por idade usando Comparator
        pessoas.sort(Comparator.comparingInt(p -> p.idade));
        System.out.println("Ordenado por idade: " + pessoas);

        // Ordenando por nome usando método de referência
        pessoas.sort(Comparator.comparing(p -> p.nome));
        System.out.println("Ordenado por nome: " + pessoas);
    }
}