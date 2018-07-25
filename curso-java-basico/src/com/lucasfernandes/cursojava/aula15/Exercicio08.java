package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe 3 preços: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		double menor = num1;
		if(menor > num2) {
			menor = num2;
		}
		if(menor > num3) {
			menor = num3;
		}
		System.out.print("O menor valor é "+menor);
	}

}
