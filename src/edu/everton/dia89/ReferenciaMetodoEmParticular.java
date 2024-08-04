package edu.everton.dia89;

import java.util.Arrays;
import java.util.List;

public class ReferenciaMetodoEmParticular {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("maçã", "banana", "cereja", "tâmara");

        // Criando um objeto da classe UtilString
        UtilString util = new UtilString();

        // Usando referência de método para um método de instância de um objeto particular
        palavras.forEach(util::imprimirEmMaiusculo);
    }
}

class UtilString {
    public void imprimirEmMaiusculo(String str) {
        System.out.println(str.toUpperCase());
    }
}
