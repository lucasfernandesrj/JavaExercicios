package com.lucasfernandes.cursojava.aula20;

public class Matrizes2 {

	public static void main(String[] args) {
		double alunosNotas[][] = {{4, 8, 6, 2}, {8, 7, 9.5, 8}};
		
		for(int i=0;i<alunosNotas.length;i++) {
			System.out.println("Notas do Aluno "+(i+1)+": ");
			for(int j=0;j<alunosNotas[i].length;j++) {
				System.out.println(alunosNotas[i][j]+" ");
			}
			System.out.println();
		}

	}

}
