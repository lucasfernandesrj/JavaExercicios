package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		System.out.print("Informe o raio do círculo: ");
		Scanner scan = new Scanner(System.in);
		try {
		float raio = scan.nextFloat();
		double area = Math.PI * Math.pow(raio, 2);
		System.out.printf("Área = %.2f m²", area);
		}
		catch(Exception e) {
			System.out.println("Valor inválido!");
		}
	}

}
