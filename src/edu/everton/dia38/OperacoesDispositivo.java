package edu.everton.dia38;

public interface OperacoesDispositivo {
    void ligar() throws IllegalStateException;
    void desligar() throws IllegalStateException;
    boolean isLigado();
}