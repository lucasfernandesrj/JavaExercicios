package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("5 perguntas para o Crime: ");
		System.out.println("Responda 1-Sim e 0-Não ");
		int total = 0;
		int resp;
		System.out.println("Telefonou pra a vítima?");
		resp = scan.nextInt();
		if(resp == 1)total++;
		System.out.println("Esteve no local do crime?");
		resp = scan.nextInt();
		if(resp == 1)total++;
		System.out.println("Mora perto da vítima?");
		resp = scan.nextInt();
		if(resp == 1)total++;
		System.out.println("Devia para a vítima?");
		resp = scan.nextInt();
		if(resp == 1)total++;
		System.out.println("Já trabalhou com a vítima?");
		resp = scan.nextInt();
		if(resp == 1)total++;
		
		System.out.print("Resultado: ");
		if(total == 0) System.out.print("Inocente");
		else if(total <= 2) System.out.print("Suspeita");
		else if(total <= 4) System.out.print("Cúmplice");
		else if(total == 5) System.out.print("Culpado");
	}

}
