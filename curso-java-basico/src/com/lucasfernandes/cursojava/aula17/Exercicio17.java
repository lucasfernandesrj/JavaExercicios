package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o n fatorial: ");
		int n = scan.nextInt();
		double resp=1;
		for(int i=1;i<=n;i++) {
		resp*=i;
		}
		System.out.printf("%d! = %.0f",n, resp);
	}

}
