package edu.everton.dia88;

import java.util.Arrays;
import java.util.List;

public class ExemploReferenciaMetodo2 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Carlos", "Ana", "Pedro", "Beatriz");

        ExemploReferenciaMetodo2 exemplo = new ExemploReferenciaMetodo2();

        // Usando expressão lambda
        nomes.forEach(nome -> exemplo.imprimirEmMinusculas(nome));

        // Usando referência de método de instância
        nomes.forEach(exemplo::imprimirEmMinusculas);
    }

    public void imprimirEmMinusculas(String s) {
        System.out.println(s.toLowerCase());
    }
}
