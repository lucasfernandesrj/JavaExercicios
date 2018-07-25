package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Lojas Tabajaras\n");
		
		Scanner scan = new Scanner(System.in);
		Scanner texto = new Scanner(System.in);
		
		boolean sair = true;
		String novaCompra;
		int numprod = 0;
		double total = 0;
		double dinheiro = 0;
		
		double prod;			
			
			while(sair){
				numprod++;
				
				System.out.print("Produto "+numprod+" : R$ ");
				prod = scan.nextDouble();
				total+=prod;

				System.out.println("Deseja informar uma nova compra? (S/N)");
				novaCompra = texto.nextLine();
				
				if(novaCompra.equalsIgnoreCase("s")) {
					sair = true;
				}else {
					sair = false;
				}
			};
			
			System.out.printf("Total: R$ %.2f", total);
			
			System.out.print("\nDinheiro: R$ ");
			dinheiro = scan.nextDouble();
			
			double troco = dinheiro - total;
			System.out.printf("Troco: R$ %.2f", troco);
		
			System.out.println("\n...");
			
			scan.close();
			texto.close();
	}

}
