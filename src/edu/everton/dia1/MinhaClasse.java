package edu.everton.dia1;

public class MinhaClasse {
    
    public static void main(String[] args) {
        
        String primeiroNome = "Everton";
        String segundoNome = "Deplá";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}
