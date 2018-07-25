package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantidade de CDs: ");
		int qtd = scan.nextInt();
		
		double somacd =0;
		for(int i=0;i<qtd;i++) {
			System.out.printf("Valor do CD %d: ",(i+1));
			double preco = scan.nextDouble();
			somacd+=preco;
		}
		double mediacd = (double) somacd/qtd;
		System.out.printf("Total gasto: R$ %.2f - Média de Gasto: R$ %.2f.",somacd, mediacd);
	}

}
