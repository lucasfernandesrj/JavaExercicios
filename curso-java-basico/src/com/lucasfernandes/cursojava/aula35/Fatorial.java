package com.lucasfernandes.cursojava.aula35;

public class Fatorial {
	public static double fatorialNormal(double num1) {
		if(num1 == 0) {
			return 1;
		}else {
			double limite = num1;
			for(int i = 1;i < limite;i++) {
				num1 *= i;
			}
			return num1;
		}
	}
		
	public static double fatorialRecursivo(double num1) {
		if(num1 == 0) {
			return 1;
		}
		return num1 * fatorialRecursivo(num1-1);
	}
}
