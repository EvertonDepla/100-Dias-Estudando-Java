package edu.everton.dia22;

public class SistemaCadastro {
    public static void main(String[] args) {
        //criando uma pessoa no sistema
        Pessoa everton = new Pessoa("123", "Everton");

        //definindo endereço
        everton.setEndereco("Rua 2 de setembro");

        System.out.println(everton.getNome() + "-" + everton.getCpf());
    }
}
