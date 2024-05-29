package edu.everton.dia21;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Felipe");
        felipe.serIdade(8);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
    }
}
