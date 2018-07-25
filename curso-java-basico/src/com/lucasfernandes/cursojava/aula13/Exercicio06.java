package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		System.out.print("Informe o raio do c�rculo: ");
		Scanner scan = new Scanner(System.in);
		try {
		float raio = scan.nextFloat();
		double area = Math.PI * Math.pow(raio, 2);
		System.out.printf("�rea = %.2f m�", area);
		}
		catch(Exception e) {
			System.out.println("Valor inv�lido!");
		}
	}

}
