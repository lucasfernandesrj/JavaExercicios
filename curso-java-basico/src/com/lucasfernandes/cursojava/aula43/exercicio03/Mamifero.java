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
				+"\nAlimento: "+this.getAlimento();
	}
}
