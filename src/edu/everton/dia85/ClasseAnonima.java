package edu.everton.dia85;

public class ClasseAnonima {
        public static void main(String[] args) {
            // Classe anônima que implementa a interface Runnable
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executando a thread");
                }
            };
    
            // Inicio da thread com a classe anônima
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
