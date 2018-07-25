package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Montar tabuada de: ");
		int tab = scan.nextInt();
		System.out.print("Começar por: ");
		int inicio = scan.nextInt();
		System.out.print("Terminar em: ");
		int fim = scan.nextInt();
		if(inicio<fim) {
			System.out.println("");
			System.out.println("Vou montar a tabuada de "+tab+" começando em "+inicio+" e terminando em "+fim+":");
			for(int i=inicio;i<fim;i++) {
				System.out.println(tab+" x "+i+" = "+(tab*i));
			}
		}else {
			System.out.println("Valor inicial maior que o final!");
		}
		
	}

}
