package com.lucasfernandes.cursojava.aula42;

public class Professor {
	
	private String departamento;
	private String nomeCurso;
	private double salario;
	
	public double calcularSalarioLiquido(){
		return 0;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endere�o do Professor: ";
		//s+= super.getEndereco();
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endere�o do Professor: ");
		System.out.println(this.obterEtiquetaEndereco());
		
	}
	
}
