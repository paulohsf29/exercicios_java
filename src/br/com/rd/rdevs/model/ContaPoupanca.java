package br.com.rd.rdevs.model;

public class ContaPoupanca extends Conta {
	
	
	

	@Override
	public String getTipo() {
		this.tipo = "Poupanca";
		return this.tipo;
	}
	
	/*@Override
	public void recuperarDadosParaImpressao(){
		System.out.println("Conta: " + super.getNumero());
		System.out.println("Titular: " + super.getTitular());
		System.out.println("Saldo: " + super.getSaldo());
		System.out.println("Limite disponivel: " + super.getLimite());
		System.out.println("Data de abertura: " + super.getDataAbertura());
		System.out.println("Rendimentos: " + this.calcularRendimentos());
		System.out.println("Tipo de Conta: " + this.getTipo());
		System.out.println("-------------------------------- ");
	}*/

}
