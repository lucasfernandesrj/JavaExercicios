package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Informe as 4 notas bimestrais: ");
		Scanner scan = new Scanner(System.in);
		try {
			double nota1 = scan.nextDouble();
			double nota2 = scan.nextDouble();
			double nota3 = scan.nextDouble();
			double nota4 = scan.nextDouble();
			double media = (nota1 + nota2 + nota3 + nota4) / 4;
			System.out.println("Média :" + media);
		}catch(Exception e) {
			System.out.println("Valor inválido!");
		}
		scan.close();
	}

}
