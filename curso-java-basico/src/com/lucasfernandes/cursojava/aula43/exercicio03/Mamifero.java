package com.lucasfernandes.cursojava.aula43.exercicio03;

public class Mamifero extends Animal {
	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public String toString() {
		return super.toString()
				+"\nAlimento: "+this.getAlimento();
	}
}
