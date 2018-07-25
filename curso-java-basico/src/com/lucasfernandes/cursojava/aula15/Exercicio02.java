package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um valor: ");
		int num1 = scan.nextInt();
		if(num1 < 0) {
			System.out.print("Valor negativo!");
		}
		else System.out.print("Valor positivo!");
		scan.close();
	}

}
