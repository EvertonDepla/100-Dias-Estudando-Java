package edu.everton.dia1;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 5;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("NA MÉDIA");
        else
            System.out.println("APROVADO");    
    }
}
