 package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe A, B e C de uma equação de segundo grau.");
		System.out.print("Informe A: ");
		double a = scan.nextDouble();
		if(a == 0) {
			System.out.println("Não é equação de segundo grau!");
		}else {
			System.out.print("Informe B: ");
			double b = scan.nextDouble();
			System.out.print("Informe C: ");
			double c = scan.nextDouble();
			
			double delta = Math.pow(b, 2) - 4*(a*c);
			
			if(delta < 0) {
				System.out.println("A equação não possui raízes reais!");
			}else {
				System.out.println("Delta: "+delta);
				
				double x1 = (-b + Math.sqrt(delta)) / (2*a);
				double x2 = (-b - Math.sqrt(delta)) / (2*a);
				if(x1 == x2) {
					System.out.println("Raíz Única: "+x1);
				}else {
					System.out.println("Raíz 1: "+x1);
					System.out.println("Raíz 2: "+x2);
				}
			}
		}
	}

}
