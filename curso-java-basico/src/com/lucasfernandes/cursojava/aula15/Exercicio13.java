package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um valor de 1 a 7: ");
		int valor = scan.nextInt();
		switch(valor) {
		case 1: 
			System.out.println("Domingo"); break;
		case 2: 
			System.out.println("Segunda"); break;
		case 3: 
			System.out.println("Terça"); break;
		case 4: 
			System.out.println("Quarta"); break;
		case 5: 
			System.out.println("Quinta"); break;
		case 6: 
			System.out.println("Sexta"); break;
		case 7: 
			System.out.println("Sábado"); break;
		default:
			System.out.println("Valor Inválido!"); break;
		}	
	}
}
