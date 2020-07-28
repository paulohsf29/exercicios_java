package br.com.rd.rdevs.main;

import java.util.ArrayList;
import java.util.List;

import br.com.rd.rdevs.model.ContaCorrente;

public class TestaContaCorrente {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		ContaCorrente c3 = new ContaCorrente();
		
//		
		c1.setTitular("Paulo");
		c2.setTitular("Leo");
		c3.setTitular("Fabio");
//		conta1.sacar(1500);
//		conta1.recuperarDadosParaImpressao();
		
		List<ContaCorrente> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c1);
		contas.add(c1);
		
		try {
			c1.depositar(-1);
		}catch(IllegalArgumentException e){
			System.out.println("Deu erro no deposito: " + e);
		}
		
		
	}

}
