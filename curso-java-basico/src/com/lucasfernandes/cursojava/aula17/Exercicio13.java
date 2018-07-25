package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a base: ");
		int base = scan.nextInt();
		System.out.print("Informe o expoente: ");
		int exp = scan.nextInt();
		int resultado =base;
		
		for(int i=1;i<exp;i++) {
			resultado*=base;
		}
		System.out.print("Resultado: "+resultado);
	}

}
