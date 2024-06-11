package edu.everton.dia34;

public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo!");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo.");
    }

    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.emitirSom();
        meuCachorro.mover();
    }
}
