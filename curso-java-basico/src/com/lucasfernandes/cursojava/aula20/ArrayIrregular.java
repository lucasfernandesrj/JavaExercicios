package com.lucasfernandes.cursojava.aula20;

import java.util.Scanner;

public class ArrayIrregular {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		
		int qtdFilhos;
		int qtdPessoas;
		
		System.out.println("Informe a quantidade de pessoas entrevistadas: ");
		qtdPessoas = scan.nextInt();
		
		int[][] entrevistas = new int[qtdPessoas][];
		String[][] nomeFilhos = new String[qtdPessoas][];
		
		for(int i = 0;i < entrevistas.length;i++) {
			System.out.println("Informe a quantidade de filhos da pessoa "+(i+1)+":");
			qtdFilhos = scan.nextInt();
			
			entrevistas[i] = new int[qtdFilhos];
			nomeFilhos[i] = new String[qtdFilhos];
			
			for(int j = 0;j < entrevistas[i].length;j++) {
				System.out.println("Informe o nome do filho "+(j+1)+": ");
				nomeFilhos[i][j] = scanString.nextLine();
			}
		}
		
		System.out.println();
		
		for(int i = 0;i < entrevistas.length;i++) {
			System.out.println("O Entrevistado "+(i+1)+" possui "+nomeFilhos[i].length+" filhos.");
			for(int j = 0;j < entrevistas[i].length;j++) {
				System.out.println(nomeFilhos[i][j]);
			}
		}
		scan.close();
		scanString.close();
	}
}
/*int[][] arrayIrregular = new int[3][];
arrayIrregular[0] = new int[1];
arrayIrregular[1] = new int[2];
arrayIrregular[2] = new int[3];*/