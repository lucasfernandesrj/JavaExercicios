package com.lucasfernandes.cursojava.aula13;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Informe um n�mero: ");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		System.out.println("o n�mero informado foi "+ numero+".");
		
		scan.close();
	}

}
