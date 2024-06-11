package edu.everton.dia34;

public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato está miando!");
    }

    @Override
    public void mover() {
        System.out.println("O gato está andando.");
    }

    public static void main(String[] args) {
        Gato meuGato = new Gato();
        meuGato.emitirSom();
        meuGato.mover();
    }
}
