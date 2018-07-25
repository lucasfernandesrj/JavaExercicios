package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio19b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int cont = 0;
		double qtd = 0;
		double total = 0;
		
		do {
			cont = 0;
			
			System.out.print("Informe uma nota: ");
			double nota = scan.nextDouble();
			
			qtd++;
			total+=nota;
			
			System.out.println("Deseja continua? (s-sim ou n-não)");
			String resp = scan.next();
			if(resp.equalsIgnoreCase("s")) {
				cont = 1;
			}
		}while(cont ==1);
		
		double resultado = (double )total/qtd;
		System.out.printf("Resultado: %.2f", resultado);
		
	}

}
