package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		System.out.println("Loja Quase Dois - Tabela de preços");
		for(int i = 1;i<=50;i++) {
			//double preco = (double)1.99 *i;
			//System.out.printf("%d - R$ %.2f\n",i, preco);
			System.out.println(i+" - R$ "+(1.99*i));
		}
	}

}
