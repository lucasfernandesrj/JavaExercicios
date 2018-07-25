package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o turno: (M-Matutino, N-Noturno ou V-Vespertino): ");
		String turno = scan.next();
		if(turno.equals("M")) {
			System.out.println("Bom Dia!");
		}else if(turno.equals("V")) {
			System.out.println("Boa Tarde!");
		}else if(turno.equals("N")) {
			System.out.println("Boa Noite!");
		}else System.out.println("Resposta Inválida!");
	}

}
