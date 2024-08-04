package edu.everton.dia88;

import java.util.Arrays;
import java.util.List;

public class ExemploReferenciaMetodo {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Everton", "Ana", "Andressa", "Silvio");

        // Usando expressão lambda
        nomes.forEach(nome -> System.out.println(nome.toUpperCase()));

        // Usando referência de método estático
        nomes.forEach(ExemploReferenciaMetodo::imprimirEmMaiusculas);
    }

    public static void imprimirEmMaiusculas(String s) {
        System.out.println(s.toUpperCase());
    }
}