package com.lucasfernandes.cursojava.aula21;

public class ForEach2 {
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
		
		for(double[] notasAluno: notasAlunos) {
			for(double notas: notasAluno) {
				System.out.print(notas+" ");
			}
			System.out.println();
		}
	}
}
