package br.com.rd.rdevs.model;

public abstract class Funcionario { 
	private String nome; 
	private String cpf; 
	private double salario; 
	private int senha; 
	
	
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public String getCpf(){
		return this.cpf;
	}
	public void setSalario (double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return this.salario;
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
	
	
	
	//Bonificacao
	public abstract double getBonificacao();
}