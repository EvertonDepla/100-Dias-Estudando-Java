package edu.everton.dia5;

public class ComentariosMaPraticas {
    public static void main(String[] args) {
        
    }
    // Abaixo estão exemplos de mal usos de comentários
    /*
     * Este método foi elaboradi as pressas
     * por isso eu abreviei o nome das variáveis
     * mas olha, ele tem a finalidade somas ou multiplicar
     * dois números
     */
    public int somaMultiplica(int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ //M = multiplicação
             r = n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }
}
