package com.lucasfernandes.cursojava.aula34;

public class Contador {
	private static int contador = 0;
	
	public Contador() {
		contador ++;
		// TODO Auto-generated constructor stub
	}
	
	public int getContador() {
		return contador;
	}
	
	public void setContador(int contador) {
		Contador.contador = contador;
	}
	
	public void zerarContador() {
		contador = 0;
	}
	
	public void incrementarContador() {
		contador++;
	}
}
