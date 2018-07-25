package com.lucasfernandes.cursojava.aula20;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdPares = 0;
		int qtdImpares = 0;
		int[][] valores = new int[3][3];
		
		for(int i = 0;i < valores.length;i++) {
			for(int j = 0; j< valores[i].length;j++) {
				System.out.print("Informe os valores: ");
				valores[i][j] = scan.nextInt();
				if(valores[i][j] %2 == 0) {
					qtdPares++;
				}else {
					qtdImpares++;
				}
			}
		}
		
		System.out.print("\nMatriz = ");
		for(int i = 0;i < valores.length;i++) {
			for(int j = 0; j< valores[i].length;j++) {
				System.out.print(valores[i][j]+" ");
			}
		}
		System.out.print("\nPares = "+qtdPares+" Impares = "+qtdImpares);
		scan.close();
	}

}
