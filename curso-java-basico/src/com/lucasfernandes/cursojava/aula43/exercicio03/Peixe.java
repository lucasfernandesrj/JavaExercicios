package com.lucasfernandes.cursojava.aula43.exercicio03;

public class Peixe extends Animal {
	private String caracteristicas;

	public Peixe() {
	}
	public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, String caracteristicas) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristicas = caracteristicas;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public String toString() {
<<<<<<< HEAD
		return super.toString()
=======
		return "Animal: "+this.getNome()
				+"\nComprimento: "+this.getComprimento()+" cm"
				+"\nPatas: "+this.getPatas()
				+"\nCor: "+this.getCor()
				+"\nAmbiente: "+this.getAmbiente()
				+"\nVelocidade: "+this.getVelocidade()+" m/s"
>>>>>>> branch 'master' of https://github.com/lucasfernandesrj/JavaExercicios.git
				+"\nCaracterística: "+this.getCaracteristicas();
	}
}
