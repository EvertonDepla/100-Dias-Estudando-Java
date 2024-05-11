package edu.everton.dia3;

public class Operadores7 {
    public static void main(String[] args) {
        String nomeUm = "EVERTON";
        String nomeDois = new String("EVERTON");

        System.out.println(nomeUm.equals(nomeDois));
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numero 1 é igual a numero 2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero 1 é diferente a numero 2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero 1 é maior que numero 2? " + simNao);
    }
}
