package com.lucasfernandes.cursojava.aula43.exercicio02;

public abstract class Contribuinte {
	private String nome;
	private double renda;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public String toString() {
		return "Nome: "+nome+" - Renda: "+renda;
	}
	
	public abstract double calcularImposto();
}
