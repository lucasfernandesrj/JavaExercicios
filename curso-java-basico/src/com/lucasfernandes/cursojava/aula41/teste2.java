package com.lucasfernandes.cursojava.aula41;

public class teste2 {

	public static void main(String[] args) {
		Object obj1 = obterString();
		String strg = (String) obj1;
		
		Object obj2 = "Minha String";
		String strg2 = (String) obj2;
		
		Object obj3 = new Object();
		//String strg3 = (String) obj3; //Falha. Tipos diferentes.
		
		Object obj4 = obterInteiro();
		//String strg4 = (String) obj4; //Falha. Tipos diferentes.
	}
	public static String obterString() {
		return "Minha String";
	}
	public static int obterInteiro() {
		return 1;
	}
}
