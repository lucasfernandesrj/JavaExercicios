package com.lucasfernandes.cursojava.aula18;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor buscado: ");
		int busca = scan.nextInt();
		for(int i=(busca+1);i<Integer.MAX_VALUE;i++) {
			System.out.println(i);
			if(i%busca==0) {
				System.out.println("O segundo divisor de "+busca+" é "+i);
				break;
			}
		}
	}

}
