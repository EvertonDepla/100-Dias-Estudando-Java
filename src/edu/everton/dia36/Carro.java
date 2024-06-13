package edu.everton.dia36;

public class Carro extends Veiculo {
    private int limiteVelocidade;

    public Carro(int limiteVelocidade) {
        super();
        this.limiteVelocidade = limiteVelocidade;
    }

    public void acelerar(int incremento) throws IllegalArgumentException {
        if (velocidade + incremento > limiteVelocidade) {
            throw new IllegalArgumentException("Velocidade excede o limite permitido.");
        }
        velocidade += incremento;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    }
}
