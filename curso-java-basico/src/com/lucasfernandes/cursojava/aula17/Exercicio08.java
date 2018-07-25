package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe 5 números: ");
		int soma = 0;
		
		for(int i = 0; i < 5; i++) {
			int num = scan.nextInt();
				soma+=num;
			}
		int media = soma/5;
		System.out.println("A soma é "+soma+" e a média é "+ media);
	}

}
