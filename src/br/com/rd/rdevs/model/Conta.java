package br.com.rd.rdevs.model;

public abstract class Conta implements Comparable<Conta> {
	protected int numero;
	protected String titular;
	protected double saldo;
	protected double limite;
	protected String dataAbertura;
	protected static int identificador = 0 ;
	protected String tipo;
	
	
	// GET Numero
	public int getNumero(){
		return this.numero;
	}
	// SET Numero
	public void setNumero(int numeroNovo){
		this.numero = numeroNovo;
	}
	
	// GET titular
	public String getTitular(){
		return this.titular;
	}
	// SET titular
	public void setTitular(String nome){
		this.titular = nome;
	}
	// GET saldo
	public double getSaldo(){
		return this.saldo;
	}
	// GET limite
	public double getLimite(){
		return this.limite;
	}
	// GET dataAbertura
	public String getDataAbertura(){
		return this.dataAbertura;
	}
	
	// GET tipoDeConta
	public abstract String getTipo();
	
	
	//Construtor
	
	
	//Saque
	public boolean sacar(double valorSacado){
		if(this.saldo < valorSacado && valorSacado < 0){
			return false;
		}else{
			this.saldo = this.saldo - valorSacado;
			return true;
		}
	}
	
	//Deposito
	public boolean depositar(double valorDepositado){
		if (valorDepositado <= 0){
			throw new IllegalArgumentException();
		}else{
			this.saldo += valorDepositado;
			return true;
		}
	}
	//Rendimentos
	public double calcularRendimentos(){
		double rendimentos = this.saldo * 0.1;
		return rendimentos;
	}
	
	//Transferencia
	public boolean transferir(double valorTransferencia, Conta contaDestino){
		if(this.saldo > valorTransferencia && valorTransferencia > 0){
			this.saldo = this.saldo - valorTransferencia;
			contaDestino.saldo = contaDestino.saldo + valorTransferencia;
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

	
	
	public void recuperarDadosParaImpressao(){
		System.out.println("Conta: " + this.numero);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Limite disponivel: " + this.limite);
		System.out.println("Data de abertura: " + this.dataAbertura);
		System.out.println("Rendimentos: " + this.calcularRendimentos());
		System.out.println("Tipo de Conta: " + this.getTipo());
		//System.out.println("Identificador " + identificador);
		System.out.println("-------------------------------- ");
	}

}







