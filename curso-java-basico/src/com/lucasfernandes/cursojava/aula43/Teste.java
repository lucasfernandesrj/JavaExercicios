package com.lucasfernandes.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setCursos("Ciencias Da Computação");
		double[] notas = {1, 5, 6, 7};
		aluno.setNotas(notas);
		
		Aluno aluno2 = new Aluno();
		aluno2.setCursos("Ciencias da Computação");
		double[] notas2 = {1, 10, 5, 9};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno);
		
		String s1 = "casaM";
		String s2 = "casam";
		
		//System.out.println(s2.equals(s1));
		System.out.println(s2.equalsIgnoreCase(s1));
		//System.out.println(s2 == s1);
		
		System.out.println(aluno.equals(aluno2));
				
	}

}
