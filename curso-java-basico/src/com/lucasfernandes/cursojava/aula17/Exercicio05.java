package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ano = 0;
		int a = 0;
		double taxaA;
		int b = 0;
		double taxaB;
		boolean cont;
		String resp;
		Scanner scan = new Scanner(System.in);
		
		do {
			cont = true;
			System.out.println("Informe a população do País A: ");
			a = scan.nextInt();
			if(a < 0) {
				cont = false;
			}
			System.out.println(cont);
			
			System.out.println("Informe a taxa de crescimento anual do País A: ");
			taxaA = scan.nextDouble();
			if(taxaA < 0 || taxaA >2) {
				cont = false;
			}
			System.out.println(cont);
			
			System.out.println("Informe a população do País B: ");
			b = scan.nextInt();
			if(b < 0) {
				cont = false;
			}
			System.out.println(cont);
			
			System.out.println("Informe a taxa de crescimento anual do País B: ");
			taxaB = scan.nextDouble();
			if(taxaB < 0 || taxaB > 2) {
				cont = false;
			}
			System.out.println(cont);
			
			if(cont == true) {
				for(;a <= b; a*=taxaA, b*=taxaB, ano++) {
					System.out.println("País A: "+a+" habitantes - País B: "+b+" habitantes.");
				}
				System.out.println("Anos necessários: " + ano);
				
				System.out.println("Deseja fazer uma nova consulta? (S-sim e N-Não): ");
				resp = scan.next();
				if(resp.equalsIgnoreCase("s")) {
					cont = true;
				}else cont = false;
			}else {
				System.out.print("Erro! Valores inválidos!");
				cont = true;
			}
			
		}while(cont == true);
		System.out.print("Programa Finalizado!");
	}

}
