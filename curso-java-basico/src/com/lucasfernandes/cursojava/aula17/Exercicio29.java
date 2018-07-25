package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int num = scan.nextInt();
		
		for(int i=1;i<num;i++) {
			int cont=0;
				for(int j=i;j>0;j--) {
					if(i%j==0) {
						cont++;
					}
				}
			if(cont==2) {
				System.out.print(i+" ");
			}
		}
		
	}

}
