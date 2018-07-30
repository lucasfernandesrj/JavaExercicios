package com.lucasfernandes.cursojava.aula25;

public class Exercicio03Aluno {
	public String nome;
	private double matricula;
	protected String curso;
	String[] disciplina = new String[3];
	double[] notas = new double[3];
	
	public void verificarAprovacao() {
		for(int i=0; i< notas.length;i++) {
			System.out.print("Disciplina: "+disciplina[i]+" - Nota: "+notas[i]+" - ");
			if(notas[i] >= 7) {
				System.out.print("Aprovado!");
			}else {
				System.out.print("Reprovado!");
			}
			System.out.println();
		}
	}
}
