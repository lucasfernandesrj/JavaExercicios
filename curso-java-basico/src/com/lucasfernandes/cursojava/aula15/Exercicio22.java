package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tecle 1-Morango 2-Maça 0-Sair: ");
		int escolha = scan.nextInt();
		
		int quant = 0;
		double preco;
		double totalpreco = 0;
		int totalquant = 0;
		
		while(escolha != 0) {
			
			if(escolha == 1 || escolha == 2) {
				System.out.println("Informe a quantidade em (Kg): ");
				quant = scan.nextInt();
				
				preco = 0;
				
				if(escolha == 1) { //Morango
					if(quant<=5) preco = quant*2.5;
					else preco = quant*2.2;
				}else if(escolha ==2) { //Maça
					if(quant<=5) preco = quant*1.8;
					else preco = quant*1.5;
				}
				
				totalquant+=quant;
				totalpreco+=preco;
				System.out.printf(">> Subtotal: %.2f - Quantidade: %d\n", totalpreco, totalquant);
				
			}else System.out.println("Escolha inválida!");
			
			System.out.println("Tecle 1-Morango 2-Maça 0-Sair: ");
			escolha = scan.nextInt();		
		}
		if(totalpreco < 25 || totalquant >= 8) totalpreco/=1.1;
		
		System.out.printf(">> Total: R$ %.2f", totalpreco);
	}
}
