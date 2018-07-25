package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe uma letra: ");
		String letra = scan.nextLine();
		if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
		System.out.print("Vogal");
		}else System.out.print("Consoante");
	}

}
