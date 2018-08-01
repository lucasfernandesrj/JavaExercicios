package com.lucasfernandes.cursojava.aula35;

public class Somatorio {
	
	public static int metodoEstatico(int num1) {
		int resultado = 0;
		for(int i = 1; i <= num1;i++) {
			resultado+=i;
		}
		return resultado;
	}
	
	public static int metodoRecursivo(int num1) {
		if(num1 == 0) {
			return 0;
		}
		return num1 + metodoRecursivo(num1-1);
	}
}
