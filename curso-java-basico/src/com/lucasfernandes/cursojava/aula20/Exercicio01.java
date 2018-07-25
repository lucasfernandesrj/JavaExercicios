package com.lucasfernandes.cursojava.aula20;

public class Exercicio01 {

	public static void main(String[] args) {
		int[][] aleatorio = new int[4][4];
		int posI = -1;
		int posJ = -1;
		int valorMaior = Integer.MIN_VALUE;

		for(int i = 0;i<aleatorio.length;i++) {
			for(int j = 0;j<aleatorio[i].length;j++) {
				aleatorio[i][j] = (int) Math.round(Math.random()*9);
				if(aleatorio[i][j] > valorMaior) {
					valorMaior = aleatorio[i][j];
					posI = i;
					posJ = j;
				}
				System.out.print(aleatorio[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Maior Valor é "+valorMaior+" na posição("+posI+","+posJ+").");

	}

}
