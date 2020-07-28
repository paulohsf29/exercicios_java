package br.com.rd.rdevs.contas;

public class ManipuladorDeSeguroDeVida {
	private SeguroDeVida seguroDeVida;
	
	public ManipuladorDeSeguroDeVida(String titular, double valor, int numApolice) {
		criaSeguro(titular, valor, numApolice);
	}
	
	public void criaSeguro(String titular, double valor, int numApolice) {
		this.seguroDeVida = new SeguroDeVida(titular, valor, numApolice);
	}

	
	public SeguroDeVida getSeguroDeVida() {
		return seguroDeVida;
	}

	public void setSeguroDeVida(SeguroDeVida seguroDeVida) {
		this.seguroDeVida = seguroDeVida;
	}
	
	public void mostrarSeguro() {
		System.out.println("Titular da apolice: " + this.seguroDeVida.getTitular());
		System.out.println("Numero da apolice: " + this.seguroDeVida.getNumApolice());
		System.out.println("Valor Seguro: " + this.seguroDeVida.getValor());
	}
	
	
}
