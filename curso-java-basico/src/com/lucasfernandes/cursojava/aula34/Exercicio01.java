package com.lucasfernandes.cursojava.aula34;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador con = new Contador();
		
		System.out.println(con.getContador());
		
		con.incrementarContador();
		System.out.println(con.getContador());
		
		con.zerarContador();
		System.out.println(con.getContador());
		
		con.setContador(5);
		System.out.println(con.getContador());
		
		Contador con2 = new Contador();
		System.out.println(con2.getContador());
		System.out.println(con.getContador());
	}

}
