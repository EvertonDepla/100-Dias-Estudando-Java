package edu.everton.dia93;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI02 {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
//       numerosAleatorios.stream()
//              .map(Integer::parseInt)
//              .filter(i -> i % 2 == 0 && i > 2)
//              .collect(Collectors.toList()
//              .forEach(System.out::println);
        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);

        System.out.println("Mostre a média dos números: ");
//       numerosAleatorios1.stream()
//              .avarege()
//              .ifPresent(System.out::println);
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
    }
}
