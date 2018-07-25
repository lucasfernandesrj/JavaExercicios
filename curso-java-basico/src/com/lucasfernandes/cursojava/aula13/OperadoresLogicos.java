package com.lucasfernandes.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado = (valor1 == 1) && (valor2 == 2);
		System.out.println("Valor1 == 1 AND  Valor2 == 2: " + resultado);
		resultado = (valor1 == 1) || (valor2 == 2);
		System.out.println("Valor1 == 1 OR  Valor2 == 2: " + resultado);
		resultado = (valor1 == 1) ^ (valor2 == 2);
		System.out.println("Valor1 == 1 OX  Valor2 == 2: " + resultado);
		resultado = !((valor1 == 1) && (valor2 == 2));
		System.out.println("Valor1 == 1 NOT AND Valor2 == 2: " + resultado);
	}

}
