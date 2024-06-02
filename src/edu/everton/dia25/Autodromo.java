package edu.everton.dia25;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("3838390");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("3293949");
        z400.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();
    }
}
