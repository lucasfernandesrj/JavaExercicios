package com.lucasfernandes.cursojava.aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		double num1 = scan.nextDouble();
		System.out.print("Informe o segundo valor: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite 1-Soma, 2-Subtração, 3-Multiplicação e 4-Divisão: ");
		int resp = scan.nextInt();
		
		double resultado = 0;
		switch(resp) {
		case 1:
			resultado = (num1+num2);break;
		case 2:
			resultado = (num1-num2);break;
		case 3:
			resultado = (num1*num2);break;
		case 4:
			resultado = (num1/num2);break;
		default: resp = 0;
		}
		if(resp != 0) { 
			System.out.print("Resultado: "+resultado);
			if(resultado%2 == 0) System.out.print(" Valor Par");
			else System.out.print(" Valor Ímpar");
			if(resultado < 0) System.out.print(" e Negativo");
			else System.out.print(" e Positivo");
		}
		else System.out.print("Valor Inválido!");
	}

}
