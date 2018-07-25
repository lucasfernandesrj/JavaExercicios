package com.lucasfernandes.cursojava.aula19;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		int[] idade = new int[10];
		int maior = Integer.MIN_VALUE;
		int indexMaior = -1;
		int menor = Integer.MAX_VALUE;
		int indexMenor = -1;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0;i<idade.length;i++) {
			System.out.print("Informe a idade do usuário da posição "+(i)+": ");
			idade[i] = scan.nextInt();
			
			if(idade[i] > maior) {
				maior = idade[i];
				indexMaior = i;
			}
			if(idade[i] < menor) {
				menor = idade[i];
				indexMenor = i;
			}
		}
		System.out.print("Vetor de idade: ");
		for(int i=0;i<idade.length;i++) {
			System.out.print(idade[i]+" ");
		}
		
		System.out.println("Maior idade = "+maior+" Índice: "+indexMaior);
		System.out.println("Menor idade = "+menor+" Índice: "+indexMenor);
		scan.close();
	}

}
