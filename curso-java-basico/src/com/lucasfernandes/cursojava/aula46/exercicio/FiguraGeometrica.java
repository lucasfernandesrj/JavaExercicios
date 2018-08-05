package com.lucasfernandes.cursojava.aula46.exercicio;

public class FiguraGeometrica {
	private String nome;
	private String cor = "Branca";
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String toString() {
		return "Nome: "+nome+" - ";
	}
}
