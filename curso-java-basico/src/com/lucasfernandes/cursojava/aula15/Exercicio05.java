package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe duas notas: ");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2) / 2;
		System.out.print("Média: "+media+ " - ");
		if(media == 10) {
			System.out.println("Aprovado com Distinção");
		}else if(media >=7) {
			System.out.println("Aprovado ");
		}else System.out.println("Reprovado! ");
	}

}
