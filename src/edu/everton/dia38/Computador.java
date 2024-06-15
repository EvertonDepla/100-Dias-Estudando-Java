package edu.everton.dia38;

public class Computador extends Dispositivo {

    public Computador() {
        super();
    }

    @Override
    public void ligar() throws IllegalStateException {
        super.ligar();
        System.out.println("Computador ligado.");
    }

    @Override
    public void desligar() throws IllegalStateException {
        super.desligar();
        System.out.println("Computador desligado.");
    }
}