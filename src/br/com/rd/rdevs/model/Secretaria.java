package br.com.rd.rdevs.model;

public class Secretaria extends Funcionario {

	
		public double getBonificacao() {
			return super.getSalario() * 0.10;
		}
}