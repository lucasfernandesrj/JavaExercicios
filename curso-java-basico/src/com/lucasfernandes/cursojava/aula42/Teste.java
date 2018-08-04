package com.lucasfernandes.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		System.out.println(Constantes.URL_TESTE);
		System.out.println(Constantes.URL_TESTE2);
		
		//Constantes.URL_TESTE = "https://github.com";
		Constantes.URL_TESTE2 = "github.com";
		
		System.out.println(Constantes.URL_TESTE);
		System.out.println(Constantes.URL_TESTE2);
	}

}
