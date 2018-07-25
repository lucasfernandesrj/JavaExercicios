package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Valor Par!");
		}else System.out.println("Valor Ímpar!");
	}

}
