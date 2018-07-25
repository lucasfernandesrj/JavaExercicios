package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		int somaidade = 0;
		int qtd = 0;
		do {
			System.out.print("Informe a idade: ");
			int idade = scan.nextInt();
			
			somaidade+=idade;
			qtd++;
			
			System.out.println("Deseja continua? (s-sim ou n-não)");
			String resp = scan.next();
			if(resp.equalsIgnoreCase("s")) {
				cont = 1;
			}else {
				cont = 0;
			}
		}while(cont == 1);
			double media = (double) somaidade/qtd;
			if(media < 25) {
				System.out.println("Resultado: A Turma é Jovem!");
			}else if(media < 60) {
				System.out.println("Resultado: A Turma é Adulta!");
			}else {
				System.out.println("Resultado: A Turma é Idosa!");
			}
	}
}
