package com.lucasfernandes.cursojava.aula36.exercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanDouble = new Scanner(System.in);
		
		Curso curso = new Curso();
		curso.setNome("Sistemas de Informação");
		curso.setHorario("Diurno");
		
		Professor professor = new Professor();
		professor.setNome("André");
		professor.setEmail("andre@email.com");
		professor.setDepartamento("Matematica");
		
		Aluno[] alunos = new Aluno[4];
		double somaMediaTotal = 0;
		for(int i = 0; i < alunos.length;i++){
			Aluno aluno = new Aluno();
			System.out.println("Informe o nome do aluno "+(i+1)+": ");
			aluno.setNome(scan.nextLine());
			System.out.println("Informe a matricula do aluno "+(i+1)+": ");
			aluno.setMatricula(scan.nextLine());
			double[] nota = new double[4];
			for(int j = 0;j < nota.length;j++) {
				System.out.println("Informe a nota "+(j+1)+": ");
				nota[j] = scanDouble.nextDouble();
			}
			aluno.setMedia(media(nota));
			somaMediaTotal+=aluno.getMedia();
			alunos[i]=aluno;
		}
		double mediaTotal = somaMediaTotal/4;
		
		curso.setProfessor(professor);
		curso.setAluno(alunos);
		
		System.out.println("Curso");
		System.out.println("Nome: "+curso.getNome());
		System.out.println("Horário: "+curso.getHorario());
		System.out.println();
		if(curso != null && curso.getProfessor() != null) {
			System.out.println("Professor");
			System.out.println("Nome: "+curso.getProfessor().getNome());
			System.out.println("Email: "+curso.getProfessor().getEmail());
			System.out.println("Departamento: "+curso.getProfessor().getDepartamento());
		}
		System.out.println();
		if(curso != null && curso.getAluno() != null) {
			System.out.println("Aluno");
			for(Aluno a : curso.getAluno()) {
				System.out.println("Nome: "+a.getNome());
				System.out.println("Matricula: "+a.getMatricula());
				System.out.println("Media: "+a.getMedia());
				if(verificarMedia(a.getMedia())) {
					System.out.println("Aprovado");
				}else {
					System.out.println("Reprovado");
				}
				System.out.println();
			}
		}
		
		System.out.println("Média Total: "+mediaTotal);
		
		scan.close();
		scanDouble.close();
	}
	
	public static double media(double[] nota) {
		double soma = 0;
		for(int i = 0;i< nota.length;i++) {
			soma+=nota[i];
		}
		return soma/4;
	}
	
	public static boolean verificarMedia(double media) {
		if(media >= 7) {
			return true;
		}else {
			return false;
		}
	}
}