package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o n-ésimo termo: ");
		int n = scan.nextInt();
		int f = 1,fi = 1, fi2 = 0;
		System.out.print(fi2);
		for(int i=1;i<n;i++) {
			System.out.print(" "+f);
			f=fi+fi2;
			fi2=fi;
			fi=f;
		}
	}

}
