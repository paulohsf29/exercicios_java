package br.com.rd.rdevs.main;

import br.com.rd.rdevs.model.Conta;
import br.com.rd.rdevs.model.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.depositar(i * 100.0);
			contas[i] = conta;
		}
		double soma = 0;
		for (int i = 0; i < contas.length; i++) {
			soma = soma + contas[i].getSaldo();
			
		}
		System.out.println(soma / contas.length);
		
		for (Conta x : contas) {
			System.out.println(x.getSaldo()); 
		}


	}

}
