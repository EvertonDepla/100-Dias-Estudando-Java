package edu.everton.dia26;

public class MSNMessenger {
    public void enviarMensagem() {
		//primeiro confirmar se esta conectado a internet
		validarConectadoInternet();

		System.out.println("Enviando mensagem");
		
		salvarHistoricoMensagem();
		//depois de enviada, salva o histórico da mensagem
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	//métodos privadas, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
