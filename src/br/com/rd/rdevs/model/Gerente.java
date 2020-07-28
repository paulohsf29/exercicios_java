package br.com.rd.rdevs.model;

public class Gerente extends Funcionario{
	private int numeroDeFuncionariosGerenciados;
	private String nomeDaEquipeGerneciada;
	private int senha;
	
	public void setNumeroDeFuncionariosGerenciados(int numero){
		this.numeroDeFuncionariosGerenciados = numero;
	}
	public int getNumeroDeFuncionariosGerenciados(){
		return this.numeroDeFuncionariosGerenciados;
	}
	
	public void setNomeDaEquipeGerneciada(String nome){
		this.nomeDaEquipeGerneciada = nome;
	}
	public String getNomeDaEquipeGerneciada(){
		return this.nomeDaEquipeGerneciada;
		
	}
	public void setSenha(int senha){
		this.senha = senha;
	}
	
	public boolean autentica(int senha) { 
		if (this.senha == senha){
			System.out.println("Acesso Permitido!"); 
			return true; 
		}else {
			System.out.println("Acesso Negado!"); 
			return false;
		}
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.15;
	}
}