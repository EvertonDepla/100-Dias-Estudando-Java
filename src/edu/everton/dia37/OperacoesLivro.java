package edu.everton.dia37;

public interface OperacoesLivro {
    void emprestar() throws IllegalArgumentException;
    void devolver();
    boolean emprestado();
}
