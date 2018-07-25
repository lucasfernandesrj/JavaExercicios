package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio14 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("Informe 10 números: ");
		int num;
		int par = 0, impar = 0;
		for(int i=0;i<10;i++) {
			num = scan.nextInt();
			if(num%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("Par: "+par+" e Impar: "+impar);
	}

}
