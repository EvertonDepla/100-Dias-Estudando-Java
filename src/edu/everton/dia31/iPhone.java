package edu.everton.dia31;

public class iPhone implements IReprodutor, IAparelho, INavegador {
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("selecionando a música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url) {
        System.err.println("Exibir a página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        //Testando IReprodutor
        meuIPhone.selecionarMusica("DragonForce - Through The Fire And Flames");
        meuIPhone.tocar();
        meuIPhone.pausar();

        //Testando IAparelho
        meuIPhone.ligar("(47)99252-4477");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        //Testando INavegador
        meuIPhone.exibirPagina("https://github.com/EvertonDepla");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
