package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Fatorial de: ");
		int n = scan.nextInt();
		double resp=1;
		System.out.printf("%d! =",n);
		for(int i=1,f=n;i<=n;i++,f--) {
		resp*=i;
			if(i==1) {
				System.out.print(" "+f);
			}else {
				System.out.print(" . "+f);	
			}
		}
		System.out.printf(" = %.0f", resp);
	}

}
