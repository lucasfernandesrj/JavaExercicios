package com.lucasfernandes.cursojava.aula43.exercicio02;

public class PessoaFisica extends Contribuinte {
	public double calcularImposto() {
		if(this.getRenda() <= 1400) {
			return 0;
		}else if(this.getRenda() <= 2100) {
			return ((this.getRenda() * 10) / 100) - 100;
		}else if(this.getRenda() <= 2800) {
			return ((this.getRenda() * 15) / 100) - 270;
		}else if(this.getRenda() <= 3600) {
			return ((this.getRenda() * 25) / 100) - 500;
		}else {
			return ((this.getRenda() * 30) / 100) - 700;
		}
	}
}
