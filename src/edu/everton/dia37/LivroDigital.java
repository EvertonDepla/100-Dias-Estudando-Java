package edu.everton.dia37;

public class LivroDigital extends Livro {

    public LivroDigital(String titulo) {
        super(titulo);
    }

    @Override
    public void emprestar() throws IllegalArgumentException {
        if (emprestado) {
            throw new IllegalArgumentException("O livro digital já está emprestado.");
        }
        emprestado = true;
        System.out.println("O livro digital '" + titulo + "' foi emprestado.");
    }

    @Override
    public void devolver() {
        emprestado = false;
        System.out.println("O livro digital '" + titulo + "' foi devolvido.");
    }
}
