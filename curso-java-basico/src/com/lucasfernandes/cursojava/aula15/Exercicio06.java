package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe 3 números: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int maior = num1;
		if(maior < num2) {
			maior = num2;
		}
		if(maior < num3) {
			maior = num3;
		}
		System.out.print("O maior valor é "+maior);
	}

}
