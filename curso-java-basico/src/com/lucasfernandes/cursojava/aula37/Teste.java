package com.lucasfernandes.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Maria");
		System.out.println(aluno.getNome());
		
		professor.setTelefoneCelular("45454");
		System.out.println(professor.getTelefoneCelular());
		
		Pessoa pAluno = new Aluno();
		//pAluno.getN -->não acessa os metodos da classe aluno
		
		Pessoa pProfessor = new Professor();
		pProfessor.getCpf(); //enxerga os metodos da superclasse
		
	}

}
