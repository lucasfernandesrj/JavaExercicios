package com.lucasfernandes.cursojava.aula25;

import java.util.Scanner;

public class Principal03 {

	public static void main(String[] args) {
		Exercicio03Aluno a1 = new Exercicio03Aluno();
		
		/*a1.nome = "Luís César Fernando";
		a1.curso = "SI";
		a1.disciplina[0] = "Lógica de programação";
		a1.disciplina[1] = "Estátisca e Probabilidade";
		a1.disciplina[2] = "Programação Orientada a Objetos";
		a1.notas[0] = 5.7;
		a1.notas[1] = 8.9;
		a1.notas[2] = 7;*/
		
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		a1.nome = scan.nextLine();
		System.out.print("Informe o curso: ");
		a1.curso = scan.nextLine();
		for(int i = 0; i< a1.disciplina.length;i++) {
			System.out.print("Informe a disciplina: ");
			a1.disciplina[i] = scan.nextLine();
			System.out.print("Informe a nota: ");
			a1.notas[i] = scan2.nextDouble();
		}
		System.out.println();
		
		a1.verificarAprovacao();
		scan.close();
		scan2.close();
	}

}
