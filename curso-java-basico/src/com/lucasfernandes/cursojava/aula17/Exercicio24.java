package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Preço do pão: R$ ");
		double pao = scan.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		for(int i = 1;i<=50;i++) {
			double preco = (double) pao*i;
			System.out.printf("%d - R$ %.2f\n",i, preco);
		}
	}

}
