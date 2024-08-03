package edu.everton.dia87;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploLambda {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Pedro");
        nomes.add("Beatriz");

        // Ordenação utilizando expressão lambda
        Collections.sort(nomes, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}