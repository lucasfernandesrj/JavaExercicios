package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Graus Farenheit: ");
		Scanner scan = new Scanner(System.in);
		double far = scan.nextDouble();
		double cel = (5 *(far-32)/9);
		System.out.print("Graus Celsius: " + cel);
	}

}
