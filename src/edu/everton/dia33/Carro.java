package edu.everton.dia33;

    public class Carro implements Veiculo {
        private int velocidade;
        private int marcha;
    
        public Carro() {
            this.velocidade = 0;
            this.marcha = 1;
        }
    
        public void acelerar() {
            velocidade += 10;
            System.out.println("O carro acelerou. Velocidade atual: " + velocidade + " km/h");
        }
    
        public void frear() {
            velocidade -= 10;
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println("O carro freiou. Velocidade atual: " + velocidade + " km/h");
        }
    
        public void trocarMarcha(int marcha) {
            this.marcha = marcha;
            System.out.println("O carro trocou para a marcha " + this.marcha);
        }
    
        public static void main(String[] args) {
            Carro meuCarro = new Carro();
            meuCarro.acelerar();
            meuCarro.acelerar();
            meuCarro.frear();
            meuCarro.trocarMarcha(3);
        }
    }

