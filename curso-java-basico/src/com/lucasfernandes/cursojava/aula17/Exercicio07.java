package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe 5 números: ");
		int maior = 0;
		
		for(int i = 0; i < 5; i++) {
			int num = scan.nextInt();
			if(maior < num){
				maior = num;
			}
		}
		System.out.println("O maior número é "+maior);
	}
}
