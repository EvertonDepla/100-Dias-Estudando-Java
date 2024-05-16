package edu.everton.dia8;

public class CondicaoEncadeada {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7)
        System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)//true ou false
        System.out.println("Prova Recuperação");
        
        else
        System.out.println("Reprovado");
    }
}
