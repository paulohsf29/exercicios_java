package br.com.rd.rdevs.model;

import br.com.rd.rdevs.contas.Tributavel;
import br.com.rd.rdevs.excecoes.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel{
//	public ContaCorrente(int numero, String titular, double saldo, double limite, String dataAbertura) {
//		super(numero, titular, saldo, limite, dataAbertura);
//	}
	

	@Override
	public String getTipo() {
		this.tipo = "Corrente";
		return this.tipo;
	}
	
	@Override
	public boolean sacar(double valorSacado){
		double saldo = super.getSaldo();
		if(valorSacado < 0){
			throw new IllegalArgumentException();
		}else if(saldo < valorSacado) {
			throw new SaldoInsuficienteException();
		}
		else{
			saldo = saldo - valorSacado - 0.1;
			return true;
		}
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
		
	}

	


}
