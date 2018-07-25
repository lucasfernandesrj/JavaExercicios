package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe duas notas: ");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double media = (nota1+nota2)/2;
		String conceito = "Média Inválida";
		if (media <=4) conceito = "E";
		else if(media <= 6) conceito = "D";
		else if(media <= 7.5) conceito = "C";
		else if(media <= 9) conceito = "B";
		else if(media <= 10) conceito = "A";
		String mensagem;
		switch(conceito) {
		case "A":
		case "B":
		case "C": 
			mensagem = "Aprovado"; break;
		case "D":
		case "E":
			mensagem = "Reprovado"; break;
		default: 
			mensagem = "Conceito Inválido!"; break;
		}
		System.out.println("Nota 1 : "+ nota1);
		System.out.println("Nota 2 : "+ nota2);
		System.out.println("Média: "+ media);
		System.out.println("Conceito: "+ conceito);
		System.out.println("Mensagem: "+ mensagem);
	}

}
