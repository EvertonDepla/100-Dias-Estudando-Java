package edu.everton.dia90;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamApi {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("maçã", "banana", "cereja", "morango", "melancia");

        List<String> palavrasComM = palavras.stream()
                                            .filter(palavra -> palavra.startsWith("m"))
                                            .collect(Collectors.toList());

        System.out.println("Palavras que começam com 'm': " + palavrasComM);

        List<String> palavrasMaiusculas = palavras.stream()
                                                  .map(String::toUpperCase)
                                                  .collect(Collectors.toList());

        System.out.println("Palavras em maiúsculas: " + palavrasMaiusculas);

        long count = palavras.stream()
                             .filter(palavra -> palavra.length() > 5)
                             .count();

        System.out.println("Número de palavras com mais de 5 caracteres: " + count);
    }
}
