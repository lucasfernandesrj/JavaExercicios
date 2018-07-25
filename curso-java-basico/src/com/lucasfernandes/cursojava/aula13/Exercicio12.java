package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Informe o peso: ");
		Scanner scan = new Scanner(System.in);
		double altura = scan.nextDouble();
		double ideal = (72.7*altura) - 58;
		System.out.printf("Seu peso ideal é %.2f kg.", ideal);
	}

}
