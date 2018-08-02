package com.lucasfernandes.cursojava.aula36.exercicio01;

public class Agenda {
	private String nome;
	private Contato[] contatos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nomeAgenda) {
		this.nome = nomeAgenda;
	}
	public Contato[] getContato() {
		return contatos;
	}
	public void setContato(Contato[] contato) {
		this.contatos = contato;
	}
	
	public String mostrarInfo() {
		String info = "Nome: "+getNome()+" \n";
		if(contatos != null) {
			for(Contato c : contatos) {
				info += c.mostrarInfo() + "\n";
			}
		}
		return info;
	}
}
