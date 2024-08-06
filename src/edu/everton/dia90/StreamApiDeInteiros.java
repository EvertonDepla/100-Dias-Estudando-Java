package edu.everton.dia90;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamApiDeInteiros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtrando números pares
        List<Integer> pares = numeros.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());

        System.out.println("Números pares: " + pares);

        List<Integer> quadrados = numeros.stream()
                                         .map(n -> n * n)
                                         .collect(Collectors.toList());

        System.out.println("Números ao quadrado: " + quadrados);

        int soma = numeros.stream()
                          .mapToInt(Integer::intValue)
                          .sum();

        System.out.println("Soma de todos os números: " + soma);

        OptionalInt max = numeros.stream()
                                 .mapToInt(Integer::intValue)
                                 .max();

        max.ifPresent(valor -> System.out.println("Maior número: " + valor));
    }
}
