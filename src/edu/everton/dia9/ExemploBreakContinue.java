package edu.everton.dia9;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for ( int numero = 1; numero <=5; numero ++){
            if(numero == 3)
                continue; //O continue pula o número 3, 
                          //Caso fosse um break a aplicação iria parar no numero 3
            System.out.println(numero);
        }                 
    }
}
