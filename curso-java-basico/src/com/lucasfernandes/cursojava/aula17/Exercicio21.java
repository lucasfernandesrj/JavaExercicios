package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("informe a quantidade de turmas: ");
		int turma = scan.nextInt();
		int alunos = 0;
		int somaturma = 0;
		boolean limite = true;
		for(int i = 1;i<=turma;i++) {
			do {
			System.out.printf("Informe a quantidade de alunos da turma %d: ",i);
			alunos = scan.nextInt();
				if(alunos>40) {
					System.out.println("### Acima do limite! Informe novamente! ###");
					limite = true;
				}else {
					limite = false;
				}
			}while(limite);
			somaturma+=alunos;
		}
		double mediaturma = (double)somaturma/turma;
		System.out.print("Média de alunos por turma: "+mediaturma);
	}

}
