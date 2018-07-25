package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe 3 números: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int maior = num1;
		int menor;
		if(maior < num2) {
			menor = maior;
			maior = num2;
		}
		else {
			menor = num2;
		}
		if(menor > num3) {
			menor = num3;
		}else if(maior< num3) {
			maior=num3;
		}
		System.out.println("Maior: "+ maior + "\nMenor: "+ menor);
	}

}
