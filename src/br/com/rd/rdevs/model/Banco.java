package br.com.rd.rdevs.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	List<Conta> contas;
	Map<String, Conta> mapContas;
	
	
	public Banco() {
		contas = new ArrayList<Conta>();
		mapContas = new HashMap();
	}
	
	public void adiciona(Conta c) {
		this.contas.add(c);
		this.mapContas.put(c.getTitular(), c);
	}
	
	public Conta pega(int x) {
		return this.contas.get(x);
		
	}
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	
	public Conta buscaPorTitular(String nome) {
		return this.mapContas.get(nome);
	}
}
