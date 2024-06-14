package edu.everton.dia37;

public class Livro implements OperacoesLivro {
    protected String titulo;
    protected boolean emprestado;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.emprestado = false;
    }

    @Override
    public void emprestar() throws IllegalArgumentException {
        if (emprestado) {
            throw new IllegalArgumentException("O livro já está emprestado.");
        }
        emprestado = true;
        System.out.println("O livro '" + titulo + "' foi emprestado.");
    }

    @Override
    public void devolver() {
        emprestado = false;
        System.out.println("O livro '" + titulo + "' foi devolvido.");
    }

    @Override
    public boolean emprestado() {
        return emprestado;
    }
}

