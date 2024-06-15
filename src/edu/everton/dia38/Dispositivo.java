package edu.everton.dia38;

public class Dispositivo implements OperacoesDispositivo {
    protected boolean ligado;

    public Dispositivo() {
        this.ligado = false;
    }

    @Override
    public void ligar() throws IllegalStateException {
        if (ligado) {
            throw new IllegalStateException("O dispositivo já está ligado.");
        }
        ligado = true;
        System.out.println("Dispositivo ligado.");
    }

    @Override
    public void desligar() throws IllegalStateException {
        if (!ligado) {
            throw new IllegalStateException("O dispositivo já está desligado.");
        }
        ligado = false;
        System.out.println("Dispositivo desligado.");
    }

    @Override
    public boolean isLigado() {
        return ligado;
    }
}