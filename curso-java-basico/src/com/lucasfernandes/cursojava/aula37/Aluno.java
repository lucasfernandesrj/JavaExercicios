package com.lucasfernandes.cursojava.aula37;

public class Aluno extends Pessoa{
	
	private String[] cursos;
	private double[][] notas;
	
	public double calcularMedia() {
		return 0;
	}
	public boolean verificarAprovado() {
		return true;
	}
	//métodos getter e setter
	
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	public double[][] getNotas() {
		return notas;
	}
	public void setNotas(double[][] notas) {
		this.notas = notas;
	}
}
