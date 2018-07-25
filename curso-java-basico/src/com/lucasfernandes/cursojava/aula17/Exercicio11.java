package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor inicial: ");
		int num = scan.nextInt();
		System.out.print("Informe o valor final: ");
		int limite = scan.nextInt();
		int soma = 0;
		for(num++;num<limite;num++) {
			System.out.print(num+" ");
			soma+=num;
		}
		System.out.println("\nResultado da soma: "+soma);
	}

}
