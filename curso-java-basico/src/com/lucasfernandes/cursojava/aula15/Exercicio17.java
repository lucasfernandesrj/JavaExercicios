package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um ano: ");
		int ano = scan.nextInt();
		int bi = 0;
		
		/*if(ano%4 == 0) {
			bi = 1;
			if(ano%100 == 0) {
				bi = 0;
				if(ano%400 == 0) {
					bi = 1;
				}else bi = 0;
			}
		}else bi = 0;*/
		
		if((ano%400 == 0) || (ano%100 != 0) && (ano%4 == 0)) {
			bi = 1;
		}
		
		if(bi == 1) {
			System.out.print("Ano bissexto!");
		}else System.out.print("Não é ano bissexto");
	}

}
