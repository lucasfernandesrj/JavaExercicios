package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um n�mero inteiro: ");
		int num = scan.nextInt();
		int cont=0;
		for(int i=num;i>0;i--) {
			if(num%i == 0) {
				cont++;
			}
		}
		if(cont == 2) {
			System.out.println("� n�mero primo!");
		}else {
			System.out.println("N�o � n�mero primo!");
		}
	}

}
