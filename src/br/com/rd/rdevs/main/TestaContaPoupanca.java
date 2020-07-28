package br.com.rd.rdevs.main;

import br.com.rd.rdevs.model.ContaPoupanca;

public class TestaContaPoupanca {

	public static void main(String[] args) {
		ContaPoupanca conta1 = new ContaPoupanca();
		
		conta1.depositar(20000);
		conta1.sacar(1500);
		conta1.recuperarDadosParaImpressao();


	}

}
