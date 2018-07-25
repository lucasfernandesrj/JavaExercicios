package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		double total = 0;
		double preco = 0;
		do {
			System.out.print("Informe o código: ");
			int cod = scan.nextInt();
			System.out.print("Informe a quantidade: ");
			int qtd = scan.nextInt();
			
			switch(cod) {
			case 100: preco = 1.2; break;
			case 101: preco = 1.3; break;
			case 102: preco = 1.5; break;
			case 103: preco = 1.2; break;
			case 104: preco = 1.3; break;
			case 105: preco = 1.0; break;
			default: preco = 0;
			}
			
			if(preco==0) {
				System.out.println("Código inválido!");
			}else {
				double subtotal= (double) preco*qtd;
				System.out.printf("Preço: %.2f x %d = %.2f",preco,qtd,subtotal);
				total+=subtotal;
				System.out.printf("\nSubtotal: %.2f",total);
			}
			
			System.out.println("\nDeseja sair? (s-sim n-não)");
			String resp = scan.next();
			if(resp.equalsIgnoreCase("s")) {
				cont = 0;
			}else {
				cont = 1;
			}
		}while(cont!=0);
		
		System.out.printf("Total: R$ %.2f",total);
	}

}
