package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor da tabuada: ");
		int tab = scan.nextInt();
		
		System.out.println("Tabuada de "+tab+":");
		for(int i = 1;i<=10;i++) {
			System.out.println(tab+" x "+i+" = "+(i*tab));
		}
	}

}
