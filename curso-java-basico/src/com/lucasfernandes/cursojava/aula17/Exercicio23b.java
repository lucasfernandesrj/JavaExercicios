package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio23b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int qtd;
		do {
		System.out.print("Quantidade de itens: ");
		qtd = scan.nextInt();
		if(qtd > 50) {
			System.out.println("### Quantidade acima do limite! ###");
		}
		}while(qtd>50);
		double totalpreco = 1.99*qtd;
		System.out.printf("Resultado: R$ %.2f.", totalpreco);
	}

}
