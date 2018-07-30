package com.lucasfernandes.cursojava.aula33;

public class Exercicio03 {
	public String nome;
	private double matricula;
	protected String curso;
	private String[] disciplina = new String[3];
	private double[] notas = new double[3];
	
	
	
	public Exercicio03(String nome, double matricula, String curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}

	public void setDisciplina(String disciplina,int posicao) {
		this.disciplina[posicao] = disciplina;
	}
	
	public void setNotas(double nota, int posicao) {
		this.notas[posicao] = nota;
	}
	
	public String getDisciplina(int posicao) {
		return this.disciplina[posicao];
	}
	
	public double getNotas(int posicao) {
		return this.notas[posicao];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getMatricula() {
		return matricula;
	}



	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



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
