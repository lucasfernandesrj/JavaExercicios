package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe M ou F: ");
		String sexo = scan.next();
		
		if(sexo.equals("F")){
			System.out.print("F - Feminino");
		}
		else if(sexo.equals("M")){
			System.out.print("M - Masculino");
		}
		else System.out.print("Sexo inválido");
		scan.close();
	}

}
