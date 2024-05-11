package edu.everton.dia3;

public class Operadores8 {
    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = true;
        //Declarações relacionais também representam um valor boolean

        if (condicao1 && ( 7 > 4 )) {
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }
}
