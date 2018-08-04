package com.lucasfernandes.cursojava.aula43.exercicio02;

public class PessoaJuridica extends Contribuinte {
	public double calcularImposto() {
		return this.getRenda()/10;
	}
}
