package com.lucasfernandes.cursojava.aula20;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		
		Random r = new Random();
		
		int maiorLinha5 = Integer.MIN_VALUE;
		int menorLinha5 = Integer.MAX_VALUE;
		
		int maiorColuna7 = Integer.MIN_VALUE;
		int menorColuna7 = Integer.MAX_VALUE;
		
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				matriz[i][j] = r.nextInt(9);
				
				if(matriz[5][j] > maiorLinha5) {
					maiorLinha5 = matriz[i][j];
				}
				
				if(matriz[5][j] < menorLinha5) {
					menorLinha5 = matriz[i][j];
				}
				
				if(matriz[i][7] > maiorColuna7) {
					maiorColuna7 = matriz[i][j];
				}
				
				if(matriz[i][7] < menorColuna7) {
					menorColuna7 = matriz[i][j];
				}
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Maior valor da linha 5: "+maiorLinha5);
		System.out.println("Menor valor da linha 5: "+menorLinha5);
		System.out.println();
		System.out.println("Maior valor da coluna 7: "+maiorColuna7);
		System.out.println("Menor valor da coluna 7: "+menorColuna7);
	}

}
