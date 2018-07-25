package com.lucasfernandes.cursojava.aula17;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ano = 0;
		for(int a=80000, b=200000; a <= b; a*=1.03, b*=1.015) {
			ano++;
			System.out.println("País A: "+a+" habitantes - País B: "+b+" habitantes.");
		}
		System.out.println("Anos necessários: " + ano);
	}

}
