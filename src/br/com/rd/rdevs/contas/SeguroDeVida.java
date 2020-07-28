package br.com.rd.rdevs.contas;

public class SeguroDeVida implements Tributavel {
	private String titular;
	private double valor;
	private int numApolice;
	
	//private double taxaFixa = 42;
	public SeguroDeVida(String titular, double valor, int numApolice) {
		this.titular = titular;
		this.valor = valor;
		this.numApolice = numApolice;
	}
	
	
	@Override
	public double getValorImposto() {
		return (this.valor * 0.02) + 42;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setSegurado(String titular) {
		this.titular = titular;
	}
	
	public int getNumApolice() {
		return this.numApolice;
	}
	
	

}
