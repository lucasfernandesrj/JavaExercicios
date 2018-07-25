package com.lucasfernandes.cursojava.aula17;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a quantidade de notas inseridas: ");
		int qtd = scan.nextInt();
		double nota;
		int soma = 0;
		for(int i = 0;i<qtd;i++ ) {
			System.out.println("Informe a nota "+(i+1)+":");
			nota = scan.nextDouble();
			soma+=nota;
		}
		double media =(double) soma/qtd;
		System.out.println("Soma: "+soma);
		System.out.println("Media: "+media);
	}

}
