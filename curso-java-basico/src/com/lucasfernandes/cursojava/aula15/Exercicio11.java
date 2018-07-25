package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o salário: ");
		double salario = scan.nextDouble();
		double antigosal = salario;
		System.out.println("Salário sem Reajuste: "+antigosal);
		if(salario <= 280) { 
			System.out.println("Percentual de aumento: 20%");
			salario*=1.2;}
		else if(salario <700) {
			System.out.println("Percentual de aumento: 15%");
			salario*=1.15;}
		else if(salario < 1500) {
			System.out.println("Percentual de aumento: 10%");
			salario*=1.1;}
		else { 
			System.out.println("Percentual de aumento: 5%");
			salario*=1.05;}
		System.out.println("Valor do aumento: "+ (salario-antigosal));
		System.out.println("Novo salário: "+salario);
		
		
	}

}
