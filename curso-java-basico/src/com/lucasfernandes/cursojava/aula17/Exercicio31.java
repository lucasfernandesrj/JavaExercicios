package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o salário inicial: ");
		double sal = scan.nextDouble();
		
		double aumento = 1.5;
		for(int i=1995;i<=2018;i++) {
			if(i>=1996) {
				sal+=(sal/100)*aumento;
				aumento*=2;
			}
			System.out.printf("\nAno: %d Aumento: %.2f%% Salário: %.2f",i,aumento,sal);
		}
	}

}
