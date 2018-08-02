package com.lucasfernandes.cursojava.aula36.exercicio01;

public class Contato {
	private String nome;
	private String telefone;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nomeContato) {
		this.nome = nomeContato;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String mostrarInfo() {
		return "Nome: "+this.getNome()
			+" Telefone: "+this.getTelefone()
			+" Email: "+this.getEmail();
	}
}
