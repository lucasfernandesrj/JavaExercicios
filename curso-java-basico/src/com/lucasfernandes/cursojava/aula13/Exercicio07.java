package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		System.out.print("Informe o lado do quadrado: ");
		Scanner scan = new Scanner(System.in);
		try {
			double lado = scan.nextDouble();
			double area = Math.pow(lado, 2);
			System.out.print("Dobro da área do quadrado: "+ area*2);

		}
		catch(Exception e) {
			System.out.println("Valor inválido!");
		}
	}
}
