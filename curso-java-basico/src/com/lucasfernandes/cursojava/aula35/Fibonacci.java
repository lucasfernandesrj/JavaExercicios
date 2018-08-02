package com.lucasfernandes.cursojava.aula35;

public class Fibonacci {
	
	public static int buscaNormal(int num1) {
		int anterior = 0;
		int atual = 1;
		int resultado = 0;
		for(int i = 0;i<num1;i++) {
			resultado = anterior + atual;
			anterior = atual;
			atual = resultado;
		}
		return resultado;
	}
	
	public static int buscaIterativa(int num1) {
		if(num1 < 2) {
			return num1;
		}else {
			return buscaNormal(num1-1) + buscaNormal(num1-2);
		}
	}
}