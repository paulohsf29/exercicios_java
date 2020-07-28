package br.com.rd.rdevs.main;

import br.com.rd.rdevs.contas.ManipuladorDeSeguroDeVida;

public class TestaSeguroDeVida {

	public static void main(String[] args) {
		ManipuladorDeSeguroDeVida seguro = new ManipuladorDeSeguroDeVida("Paulo H", 5000, 532);
	
		seguro.mostrarSeguro();
	
	}

}
