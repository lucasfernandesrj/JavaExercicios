package com.lucasfernandes.cursojava.aula52;

public class ContatoNaoExisteException extends Exception {
	private String nome;
	public ContatoNaoExisteException(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "O contato "+nome+" não existe na Agenda!";
	}
}
