package com.lucasfernandes.cursojava.aula12;

import java.util.Scanner;

public class LeituraDeDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o seu nome completo: ");
		String nome = scan.nextLine();
		
		System.out.print("Informe o seu primeiro nome: ");
		String primeiroNome = scan.next();
		
		System.out.print("Informe a sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Infome a sua altura: ");
		double altura = scan.nextDouble();
		
		System.out.println("Seu nome �: " + nome +
				"\nSeu primeiro nome �: "+ primeiroNome + 
				"\nSua idade �: " +idade+" anos"+
				"\nSua altura �: " + altura);
		
	}

}
