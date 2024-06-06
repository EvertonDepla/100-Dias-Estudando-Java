package edu.everton.dia29.estabelecimento;

import edu.everton.dia29.copiadora.Copiadora;
import edu.everton.dia29.digitalizadora.Digitalizadora;
import edu.everton.dia29.digitalizadora.Scanner;
import edu.everton.dia29.impressora.Impressora;
import edu.everton.dia29.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Scanner scanner = new Scanner();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = scanner;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}

