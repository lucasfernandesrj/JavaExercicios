package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Graus Celsius: ");
		Scanner scan = new Scanner(System.in);
		double cel = scan.nextDouble();
		double far = (cel*1.80)+ 32;
		System.out.print("Graus Farenheit: " + far);

	}

}
