package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String nome;
		String senha;
		
		do {
			System.out.print("Nome do Usu�rio: ");
			nome = scan.nextLine();
			System.out.print("Senha do Usu�rio: ");
			senha = scan.nextLine();
			if(senha.equalsIgnoreCase(nome)) {
				System.out.println("Senha ou Nome inv�lido! Informe novamente!");
			}
		}while(senha.equalsIgnoreCase(nome));
		System.out.println("Acesso permitido!");
		scan.close();
	}

}
