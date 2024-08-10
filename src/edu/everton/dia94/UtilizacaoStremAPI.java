package edu.everton.dia94;

import java.util.Arrays;
import java.util.List;

public class UtilizacaoStremAPI {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int soma = numeros.stream() // Cria uma stream a partir da lista
                .filter(n -> n % 2 == 0) // Filtra apenas os números pares
                .map(n -> n * 2) // Multiplica cada número por 2
                .reduce(0, Integer::sum); // Soma todos os valores

        System.out.println("A soma dos números pares multiplicados por 2 é: " + soma);
    }
}
