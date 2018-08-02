package com.lucasfernandes.cursojava.aula36.exercicio01;

public class Agenda {
	private String nomeAgenda;
	private Contato[] contato;
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public Contato[] getContato() {
		return contato;
	}
	public void setContato(Contato[] contato) {
		this.contato = contato;
	}
}
