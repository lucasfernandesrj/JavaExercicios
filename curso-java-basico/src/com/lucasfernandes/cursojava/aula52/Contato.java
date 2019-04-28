package com.lucasfernandes.cursojava.aula52;

public class Contato {
	private static int contador = 0;
	private String nome;
	private String telefone;
	private int id = 0;
	
	public Contato(String nome, String telefone) {
		contador++;
		this.nome = nome;
		this.telefone = telefone;
		this.id = contador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdentificador() {
		return id;
	}
	public String toString() {
		return "Id: "+id+" - Nome: "+nome+" - Telefone: "+telefone;
	}
}
