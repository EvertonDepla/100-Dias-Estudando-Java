package edu.everton.dia37;

public class Main {
    public static void main(String[] args) {
        LivroDigital meuLivro = new LivroDigital("Apredendo Java");

        try {
            meuLivro.emprestar();
            meuLivro.emprestar(); // Tentativa de emprestar um livro já emprestado
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        meuLivro.devolver();

        try {
            meuLivro.emprestar(); // Emprestar novamente após devolver
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        System.out.println("Status de empréstimo: " + (meuLivro.emprestado() ? "Emprestado" : "Disponível"));
    }
}