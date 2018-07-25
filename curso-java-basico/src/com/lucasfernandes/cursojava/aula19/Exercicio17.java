package com.lucasfernandes.cursojava.aula19;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		int[] idade = new int[10];
		Scanner scan = new Scanner(System.in);
		int contador = 0;
		System.out.print("Vetor: ");
		for(int i = 0;i<idade.length;i++) {
			//System.out.print("Informe a idade "+(i+1)+": ");
			//idade[i] = scan.nextInt();
			idade[i]= (int) Math.round(Math.random()*100);
			
			if(idade[i] > 35) {
				System.out.print(idade[i]+" ");
				contador++;
			}
		}
		System.out.println("\nQuantidade de idades acima de 35 anos: "+contador);
		scan.close();
	}

}
