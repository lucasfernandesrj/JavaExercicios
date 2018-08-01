package com.lucasfernandes.cursojava.aula34;

public class Contador {
	private static int contador = 0;
	
	public Contador() {
		contador ++;
	}
	
	private static int getContador() {
		return contador;
	}
	
	public static void setContador(int contador) {
		Contador.contador = contador;
	}
	
	public static void zerarContador() {
		contador = 0;
	}
	
	public static void incrementarContador() {
		contador++;
	}
	
	public static void mostrarContador() {
		System.out.println(Contador.getContador());
	}
}
