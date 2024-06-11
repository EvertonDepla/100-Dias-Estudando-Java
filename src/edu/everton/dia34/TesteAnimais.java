package edu.everton.dia34;

public class TesteAnimais {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        System.out.println("Interações com o cachorro:");
        meuCachorro.emitirSom();
        meuCachorro.mover();

        System.out.println("\nInterações com o gato:");
        meuGato.emitirSom();
        meuGato.mover();
    }
}

