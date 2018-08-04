package com.lucasfernandes.cursojava.aula43.exercicio03;

public class Animal {
	private String nome;
	private double comprimento;
	private int patas = 4;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal() {
	}
	public Animal(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public String toString() {
		return "Animal: "+nome
				+"\nComprimento: "+comprimento+" cm"
				+"\nPatas: "+patas
				+"\nCor: "+cor
				+"\nAmbiente: "+ambiente
				+"\nVelocidade: "+velocidade+" m/s";
	}
}
