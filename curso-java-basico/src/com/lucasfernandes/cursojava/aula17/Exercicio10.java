package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor inicial: ");
		int num = scan.nextInt();
		System.out.print("Informe o valor final: ");
		int limite = scan.nextInt();
		
		for(num++;num<limite;num++) {
			System.out.print(num+" ");
		}
	}

}
