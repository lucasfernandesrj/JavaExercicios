package com.lucasfernandes.cursojava.aula43;

import java.util.Arrays;

public class Aluno{
	
	private String cursos;
	private double[] notas;

	public String getCursos() {
		return cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double calcularMedia() {
		return 0;
	}
	public boolean verificarAprovado() {
		return true;
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do Aluno: ";
		//s+= super.getEndereco();
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
		
	}
	@Override
	public String toString() {
		return "Aluno [cursos=" + cursos + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Aluno other = (Aluno) obj;
		if(!cursos.equalsIgnoreCase(other.getCursos())) {
			return false;
		}
		return true;
	}
	
	
	/*public String toString() {
		String s = this.cursos + "\n";
		for(double nota : notas){
			s += nota + " ";
		}
		return s;
	}*/
	
}
