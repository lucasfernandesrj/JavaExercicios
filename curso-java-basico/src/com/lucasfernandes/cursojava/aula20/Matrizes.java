package com.lucasfernandes.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		double[][] notasAlunos = new double[3][4];
		notasAlunos[0][0]=4;
		notasAlunos[0][1]=9;
		notasAlunos[0][2]=7;
		notasAlunos[0][3]=6.5;
		
		notasAlunos[1][0]=9;
		notasAlunos[1][1]=8.5;
		notasAlunos[1][2]=2;
		notasAlunos[1][3]=4.5;
		
		notasAlunos[2][0]=1;
		notasAlunos[2][1]=4;
		notasAlunos[2][2]=8.5;
		notasAlunos[2][3]=4.5;
		
		for(int i=0;i<notasAlunos.length;i++) {
			System.out.println("Aluno "+(i+1));
			for(int j=0;j<notasAlunos[i].length;j++) {
				System.out.println("nota "+(j+1)+" = "+notasAlunos[i][j]);
			}
			System.out.println();
		}
		notasAlunos[1][3]=8;
		
		for(int i=0;i<notasAlunos.length;i++) {
			System.out.println("Aluno "+(i+1));
			for(int j=0;j<notasAlunos[i].length;j++) {
				System.out.println("nota "+(j+1)+" = "+notasAlunos[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Calculando a média de cada aluno: ");
		int soma;
		for(int i=0;i<notasAlunos.length;i++) {
			soma = 0;
			for(int j=0;j<notasAlunos[i].length;j++) {
				soma+=notasAlunos[i][j];
			}
			System.out.println("Média do Aluno "+(i+1)+" = "+(soma/4.0));
		}
	}

}
