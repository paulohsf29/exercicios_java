package br.com.rd.rdevs.main;

import br.com.rd.rdevs.model.Diretor;

public class TestaDiretor {

	public static void main(String[] args) {
		Diretor diretor = new Diretor();
		
		diretor.setSalario(2000);
		
		System.out.println(diretor.getBonificacao());

	}

}
