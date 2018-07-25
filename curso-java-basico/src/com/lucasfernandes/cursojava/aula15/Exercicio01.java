package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe dois valores: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 > num2) {
			System.out.println(num1);
		}
		else System.out.println("O maior valor é "+num2);
	}

}
