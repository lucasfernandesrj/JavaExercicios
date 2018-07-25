package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe dois números:");
		try {
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		int soma = num1 + num2;
		System.out.println("O resultado da soma é: " + soma);
		}
		catch(Exception e) {
		System.out.println("Valor inválido");
		}
		scan.close();
	}
}
