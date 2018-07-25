package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		int num1;
		int num2;
		double num3;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe dois valores inteiros e um real: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextDouble();
		double resp1 = (num1*2)*(num2/2);
		double resp2 = (num1*3)+num3;
		double resp3 = num3*num3*num3;
		double resp4 = Math.pow(num3, 3);
		System.out.println("Resposta a: " + resp1+
				"\nResposta b: " + resp2+
				"\nResposta c: " + resp3 + resp4);
		

	}

}
