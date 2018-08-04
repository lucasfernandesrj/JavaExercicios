package com.lucasfernandes.cursojava.aula45;

public class PessoaJuridica extends Contribuinte {
	public double calcularImposto() {
		return this.getRenda()/10;
	}
}
